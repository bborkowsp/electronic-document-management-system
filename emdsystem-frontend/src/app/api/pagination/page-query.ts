import {Query} from './query';
import {HttpParams} from "@angular/common/http";

export class PageQuery implements Query {
    private static readonly PAGE_QUERY_KEY = 'page';
    private static readonly SIZE_QUERY_KEY = 'size';

    private readonly _page: number;
    private readonly _size?: number;

    constructor(page: number, size?: number) {
        this._page = page;
        this._size = size;
    }

    get page() {
        return this._page;
    }

    get size() {
        return this._size;
    }

    toHttpParams() {
        let params = new HttpParams();
        params = this.setPageParam(params);
        params = this.setSizeParam(params);
        return params;
    }

    private setPageParam(params: HttpParams) {
        return params.set(PageQuery.PAGE_QUERY_KEY, String(this._page));
    }

    private setSizeParam(params: HttpParams) {
        if (!this._size) {
            return params;
        }

        return params.set(PageQuery.SIZE_QUERY_KEY, String(this._size));
    }

    private concatenateHttpParams(params: HttpParams, otherParams: HttpParams) {
        otherParams.keys().forEach((key) => {
            params = params.set(key, otherParams.get(key)!);
        });

        return params;
    }
}
