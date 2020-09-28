import { Injectable } from '@angular/core';
import { HttpResponse } from '@angular/common/http';
import { Resolve, ActivatedRouteSnapshot, RouterStateSnapshot, Routes } from '@angular/router';
import { UserRouteAccessService } from 'app/core';
import { Observable, of } from 'rxjs';
import { filter, map } from 'rxjs/operators';
import { AccountEntity } from 'app/shared/model/account-entity.model';
import { AccountEntityService } from './account-entity.service';
import { AccountEntityComponent } from './account-entity.component';
import { AccountEntityDetailComponent } from './account-entity-detail.component';
import { AccountEntityUpdateComponent } from './account-entity-update.component';
import { AccountEntityDeletePopupComponent } from './account-entity-delete-dialog.component';
import { IAccountEntity } from 'app/shared/model/account-entity.model';

@Injectable({ providedIn: 'root' })
export class AccountEntityResolve implements Resolve<IAccountEntity> {
  constructor(private service: AccountEntityService) {}

  resolve(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): Observable<IAccountEntity> {
    const id = route.params['id'] ? route.params['id'] : null;
    if (id) {
      return this.service.find(id).pipe(
        filter((response: HttpResponse<AccountEntity>) => response.ok),
        map((accountEntity: HttpResponse<AccountEntity>) => accountEntity.body)
      );
    }
    return of(new AccountEntity());
  }
}

export const accountEntityRoute: Routes = [
  {
    path: '',
    component: AccountEntityComponent,
    data: {
      authorities: ['ROLE_USER'],
      pageTitle: 'secondApp.accountEntity.home.title'
    },
    canActivate: [UserRouteAccessService]
  },
  {
    path: ':id/view',
    component: AccountEntityDetailComponent,
    resolve: {
      accountEntity: AccountEntityResolve
    },
    data: {
      authorities: ['ROLE_USER'],
      pageTitle: 'secondApp.accountEntity.home.title'
    },
    canActivate: [UserRouteAccessService]
  },
  {
    path: 'new',
    component: AccountEntityUpdateComponent,
    resolve: {
      accountEntity: AccountEntityResolve
    },
    data: {
      authorities: ['ROLE_USER'],
      pageTitle: 'secondApp.accountEntity.home.title'
    },
    canActivate: [UserRouteAccessService]
  },
  {
    path: ':id/edit',
    component: AccountEntityUpdateComponent,
    resolve: {
      accountEntity: AccountEntityResolve
    },
    data: {
      authorities: ['ROLE_USER'],
      pageTitle: 'secondApp.accountEntity.home.title'
    },
    canActivate: [UserRouteAccessService]
  }
];

export const accountEntityPopupRoute: Routes = [
  {
    path: ':id/delete',
    component: AccountEntityDeletePopupComponent,
    resolve: {
      accountEntity: AccountEntityResolve
    },
    data: {
      authorities: ['ROLE_USER'],
      pageTitle: 'secondApp.accountEntity.home.title'
    },
    canActivate: [UserRouteAccessService],
    outlet: 'popup'
  }
];
