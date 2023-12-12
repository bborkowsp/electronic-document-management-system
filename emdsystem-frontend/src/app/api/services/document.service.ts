import {Injectable} from '@angular/core';
import {map, Observable, tap} from "rxjs";
import {HttpClient} from "@angular/common/http";
import {Documents} from "../../documents/documents";
import {DocumentResource} from "../dto/resources/document.resource";
import {environment} from "../../../environments/environment.development";

@Injectable({
  providedIn: 'root'
})
export class DocumentService {
  private static readonly DOCUMENTS_ENDPOINT = 'edm/document';

  constructor(private httpClient: HttpClient) {
  }

  getDocument(id: number) {
    return this.httpClient.get<DocumentResource>(
      `${environment.apiBaseUrl}${DocumentService.DOCUMENTS_ENDPOINT}/${id}`,
    );
  }

  getAllDocuments(): Observable<Documents[]> {
    return this.httpClient
      .get<{ content: Documents[] }>(`${environment.apiBaseUrl}${DocumentService.DOCUMENTS_ENDPOINT}`,)
      .pipe(
        map(response => response.content),
        tap(documents => console.log('Documents in Service:', documents))
      );
  }


  save(document: DocumentResource) {
    return this.httpClient.put<void>(
      `${environment.apiBaseUrl}${DocumentService.DOCUMENTS_ENDPOINT}/${document.id}`,
      document
    );
  }
}
