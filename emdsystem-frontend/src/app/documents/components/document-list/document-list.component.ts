import {Component, ViewChild} from '@angular/core';
import {Observable, tap} from "rxjs";
import {MatPaginator} from '@angular/material/paginator';

import {Documents} from "../../documents";
import {DocumentsService} from "../../../api/services/documents.service";


@Component({
  selector: 'app-document-list',
  templateUrl: './document-list.component.html',
  styleUrls: ['./document-list.component.scss'],
})
export class DocumentListComponent {
  readonly displayedColumns: string[] = [
    'id',
    'documentType',
    'documentNumber',
    'saleDate',
    'issueDate',
    'receiptDate',
    'grossAmount',
    'netAmount',
    'currency',
    'supplierCompany',
    'recipientCompany',
  ];
  documents$: Observable<Documents[]>;
  dataLength: number = 0;
  @ViewChild(MatPaginator) readonly paginator!: MatPaginator;

  constructor(private readonly documentService: DocumentsService) {
    this.documents$ = this.getData();
  }

  getData(): Observable<Documents[]> {
    return this.documentService.getAllDocuments().pipe(
      tap({
        next: (documents) => {
          console.log('Documents:', documents);
          this.dataLength = documents.length;
        },
        error: (err) => console.log(err),
      }),
    );
  }

}
