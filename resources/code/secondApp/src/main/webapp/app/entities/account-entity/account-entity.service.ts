import { Injectable } from '@angular/core';
import { HttpClient, HttpResponse } from '@angular/common/http';
import { Observable } from 'rxjs';

import { SERVER_API_URL } from 'app/app.constants';
import { createRequestOption } from 'app/shared';
import { IAccountEntity } from 'app/shared/model/account-entity.model';

type EntityResponseType = HttpResponse<IAccountEntity>;
type EntityArrayResponseType = HttpResponse<IAccountEntity[]>;

@Injectable({ providedIn: 'root' })
export class AccountEntityService {
  public resourceUrl = SERVER_API_URL + 'api/account-entities';

  constructor(protected http: HttpClient) {}

  create(accountEntity: IAccountEntity): Observable<EntityResponseType> {
    return this.http.post<IAccountEntity>(this.resourceUrl, accountEntity, { observe: 'response' });
  }

  update(accountEntity: IAccountEntity): Observable<EntityResponseType> {
    return this.http.put<IAccountEntity>(this.resourceUrl, accountEntity, { observe: 'response' });
  }

  find(id: number): Observable<EntityResponseType> {
    return this.http.get<IAccountEntity>(`${this.resourceUrl}/${id}`, { observe: 'response' });
  }

  query(req?: any): Observable<EntityArrayResponseType> {
    const options = createRequestOption(req);
    return this.http.get<IAccountEntity[]>(this.resourceUrl, { params: options, observe: 'response' });
  }

  delete(id: number): Observable<HttpResponse<any>> {
    return this.http.delete<any>(`${this.resourceUrl}/${id}`, { observe: 'response' });
  }
}
