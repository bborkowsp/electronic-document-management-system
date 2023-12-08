import {Component, OnInit, ViewChild} from '@angular/core';
import {Observable, tap} from "rxjs";
import {MatPaginator} from '@angular/material/paginator';

import {DocumentService} from "../../document.service";
import {Document} from "../../document";


@Component({
  selector: 'app-document-list',
  templateUrl: './document-list.component.html',
  styleUrls: ['./document-list.component.scss'],
})
export class DocumentListComponent implements OnInit {
  readonly displayedColumns: string[] = [
    'id',
    // 'documentType',
    // 'documentNumber',
    // 'receiptDate',
    // 'saleDate',
    // 'issueDate',
    // 'receiptDate',
    // 'grossAmount',
    // 'netAmount',
    // 'currency',
    // 'supplierCompany',
    // 'recipientCompany',
  ];
  documents$: Observable<Document[]>;
  dataLength: number = 0;
  @ViewChild(MatPaginator) readonly paginator!: MatPaginator;

  constructor(private readonly documentService: DocumentService) {
    console.log('Before getData');

    this.documents$ = this.getData();
  }

  ngOnInit() {
    this.getData();
  }

  getData(): Observable<Document[]> {
    console.log('im here');

    return this.documentService.getAllDocuments().pipe(
      tap({
        next: (documents) => (this.dataLength = documents.length),
        error: (err) => console.log(err),
      }),
    );
  }
}
