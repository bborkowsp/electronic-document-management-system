import {Component, ViewChild} from '@angular/core';
import {Observable, tap} from "rxjs";
import {MatPaginator} from '@angular/material/paginator';

import {DocumentService} from "../../document.service";
import {Document} from "../../document";


@Component({
  selector: 'app-document-list',
  templateUrl: './document-list.component.html',
  styleUrls: ['./document-list.component.scss'],
})
export class DocumentListComponent {
  readonly displayedColumns: string[] = [
    'documentId',
    'supplierCompany',
    'recipientCompany',
    'documentType',
    'issueDate',
    'saleDate',
    'receiptDate',
    'documentNumber',
    'netAmount',
    'grossAmount',
    'currency'
  ];
  documents$: Observable<Document[]>;
  dataLength: number = 0;
  @ViewChild(MatPaginator) readonly paginator!: MatPaginator;

  constructor(private readonly documentService: DocumentService) {
    this.documents$ = this.getData();
  }

  getData(): Observable<Document[]> {
    return this.documentService.getAllDocuments().pipe(
      tap({
        next: (documents) => (this.dataLength = documents.length),
        error: (err) => console.log(err),
      }),
    );
  }
}
