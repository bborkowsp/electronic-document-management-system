import {Injectable} from '@angular/core';
import {map, Observable, tap} from "rxjs";
import {HttpClient} from "@angular/common/http";
import {Documents} from "./documents";

@Injectable({
  providedIn: 'root'
})
export class DocumentsService {
  private baseURL = 'http://localhost:8080/edm/document';

  constructor(private httpClient: HttpClient) {
  }

  getAllDocuments(): Observable<Documents[]> {
    return this.httpClient
      .get<{ content: Documents[] }>(this.baseURL)
      .pipe(
        map(response => response.content),
        tap(documents => console.log('Documents in Service:', documents))
      );
  }


}
