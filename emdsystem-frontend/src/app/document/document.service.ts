import {Injectable} from '@angular/core';
import {map, Observable} from "rxjs";
import {HttpClient} from "@angular/common/http";
import {Document} from "./document";

@Injectable({
  providedIn: 'root'
})
export class DocumentService {
  private baseURL = 'http://localhost:8080/edm/document';

  constructor(private httpClient: HttpClient) {
  }

  getAllDocuments(): Observable<Document[]> {
    return this.httpClient
      .get<{ content: Document[] }>(this.baseURL)
      .pipe(map((response) => response.content));
  }

}
