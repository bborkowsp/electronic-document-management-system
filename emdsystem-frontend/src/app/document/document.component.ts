import {Component, OnInit} from '@angular/core';
import {map, Observable, switchMap, tap} from "rxjs";
import {DocumentResource} from "../api/dto/resources/document.resource";
import {DocumentService} from "../api/services/document.service";
import {ActivatedRoute} from "@angular/router";
import {DomSanitizer} from "@angular/platform-browser";

@Component({
  selector: 'app-document',
  templateUrl: './document.component.html',
  styleUrls: ['./document.component.scss']
})
export class DocumentComponent implements OnInit {
  private static readonly ID_PARAM_KEY = 'id';
  documentId: number | null = null;
  document$: Observable<DocumentResource> | null = null;

  constructor(
    private readonly documentService: DocumentService,
    private readonly activatedRoute: ActivatedRoute,
    private readonly sanitizer: DomSanitizer
  ) {
  }

  ngOnInit(): void {
    this.getDocument();
  }


  private getDocument() {
    this.document$ = this.activatedRoute.paramMap.pipe(
      map((paramMap) => parseInt(paramMap.get(DocumentComponent.ID_PARAM_KEY)!)),
      tap((id) => (this.documentId = id)),
      switchMap((id) => this.documentService.getDocument(id)),
    );
  }

  getPdfUrl(encodedPdf: string) {
    const dataUrl = `data:application/pdf;base64,${encodedPdf}`;
    return this.sanitizer.bypassSecurityTrustResourceUrl(dataUrl);
  }
}
