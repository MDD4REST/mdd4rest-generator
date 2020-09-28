import { Injectable } from '@angular/core';
import { HttpClient, HttpResponse } from '@angular/common/http';
import { Observable } from 'rxjs';

import { SERVER_API_URL } from 'app/app.constants';
import { createRequestOption } from 'app/shared';
import { IBookmark } from 'app/shared/model/bookmark.model';

type EntityResponseType = HttpResponse<IBookmark>;
type EntityArrayResponseType = HttpResponse<IBookmark[]>;

@Injectable({ providedIn: 'root' })
export class BookmarkService {
  public resourceUrl = SERVER_API_URL + 'api/bookmarks';

  constructor(protected http: HttpClient) {}

  create(bookmark: IBookmark): Observable<EntityResponseType> {
    return this.http.post<IBookmark>(this.resourceUrl, bookmark, { observe: 'response' });
  }

  update(bookmark: IBookmark): Observable<EntityResponseType> {
    return this.http.put<IBookmark>(this.resourceUrl, bookmark, { observe: 'response' });
  }

  find(id: number): Observable<EntityResponseType> {
    return this.http.get<IBookmark>(`${this.resourceUrl}/${id}`, { observe: 'response' });
  }

  query(req?: any): Observable<EntityArrayResponseType> {
    const options = createRequestOption(req);
    return this.http.get<IBookmark[]>(this.resourceUrl, { params: options, observe: 'response' });
  }

  delete(id: number): Observable<HttpResponse<any>> {
    return this.http.delete<any>(`${this.resourceUrl}/${id}`, { observe: 'response' });
  }
}
