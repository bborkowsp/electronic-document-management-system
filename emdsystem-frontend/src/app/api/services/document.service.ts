import {Injectable} from '@angular/core';
import {map, Observable, tap} from "rxjs";
import {HttpClient} from "@angular/common/http";
import {Documents} from "../../documents/documents";
import {DocumentResource} from "../dto/resources/document.resource";

@Injectable({
  providedIn: 'root'
})
export class DocumentService {
  private baseURL = 'http://localhost:8080/edm/document';

  constructor(private httpClient: HttpClient) {
  }

  getDocument(id: number) {
    return this.httpClient.get<DocumentResource>(
      `${this.baseURL}/${id}`,
    );
  }

  getAllDocuments(): Observable<Documents[]> {
    return this.httpClient
      .get<{ content: Documents[] }>(this.baseURL)
      .pipe(
        map(response => response.content),
        tap(documents => console.log('Documents in Service:', documents))
      );
  }


  save(document: DocumentResource) {
    return this.httpClient.put<void>(
      `${this.baseURL}/${document.id}`,
      document
    );
  }
}
