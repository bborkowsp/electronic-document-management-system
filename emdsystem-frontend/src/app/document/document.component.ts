import {Component, OnInit} from '@angular/core';
import {Observable} from "rxjs";
import {DocumentResource} from "../api/dto/resources/document.resource";
import {DocumentsService} from "../documents/documents.service";

@Component({
  selector: 'app-document',
  templateUrl: './document.component.html',
  styleUrls: ['./document.component.scss']
})
export class DocumentComponent implements OnInit {
  private static readonly ID_PARAM_KEY = 'id';
  document$: Observable<DocumentResource> | null = null;

  constructor(
    private readonly documentService: DocumentsService,
  ) {
  }

  ngOnInit(): void {
    this.getDocument();
  }


  private getDocument() {

  }
}
