import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {PageQuery} from "../pagination/page-query";

@Injectable({
    providedIn: 'root'
})
export class DocumentService {
    private static readonly DOCUMENT_ENDPOINT = '/documents';

    constructor(private readonly httpClient: HttpClient) {
    }

    getPageOfDocuments(pageQuery: PageQuery) {
        const params = pageQuery.toHttpParams();
        return this.httpClient.get<PageResponse<DocumentInTableResource>>(
            `${environment.apiBaseUrl}${RecipeService.RECIPES_ENDPOINT}`,
            {
                params,
            },
        );
    }

}
