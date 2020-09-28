import { Injectable } from '@angular/core';
import { HttpResponse } from '@angular/common/http';
import { Resolve, ActivatedRouteSnapshot, RouterStateSnapshot, Routes } from '@angular/router';
import { UserRouteAccessService } from 'app/core';
import { Observable, of } from 'rxjs';
import { filter, map } from 'rxjs/operators';
import { Bookmark } from 'app/shared/model/bookmark.model';
import { BookmarkService } from './bookmark.service';
import { BookmarkComponent } from './bookmark.component';
import { BookmarkDetailComponent } from './bookmark-detail.component';
import { BookmarkUpdateComponent } from './bookmark-update.component';
import { BookmarkDeletePopupComponent } from './bookmark-delete-dialog.component';
import { IBookmark } from 'app/shared/model/bookmark.model';

@Injectable({ providedIn: 'root' })
export class BookmarkResolve implements Resolve<IBookmark> {
  constructor(private service: BookmarkService) {}

  resolve(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): Observable<IBookmark> {
    const id = route.params['id'] ? route.params['id'] : null;
    if (id) {
      return this.service.find(id).pipe(
        filter((response: HttpResponse<Bookmark>) => response.ok),
        map((bookmark: HttpResponse<Bookmark>) => bookmark.body)
      );
    }
    return of(new Bookmark());
  }
}

export const bookmarkRoute: Routes = [
  {
    path: '',
    component: BookmarkComponent,
    data: {
      authorities: ['ROLE_USER'],
      pageTitle: 'secondApp.bookmark.home.title'
    },
    canActivate: [UserRouteAccessService]
  },
  {
    path: ':id/view',
    component: BookmarkDetailComponent,
    resolve: {
      bookmark: BookmarkResolve
    },
    data: {
      authorities: ['ROLE_USER'],
      pageTitle: 'secondApp.bookmark.home.title'
    },
    canActivate: [UserRouteAccessService]
  },
  {
    path: 'new',
    component: BookmarkUpdateComponent,
    resolve: {
      bookmark: BookmarkResolve
    },
    data: {
      authorities: ['ROLE_USER'],
      pageTitle: 'secondApp.bookmark.home.title'
    },
    canActivate: [UserRouteAccessService]
  },
  {
    path: ':id/edit',
    component: BookmarkUpdateComponent,
    resolve: {
      bookmark: BookmarkResolve
    },
    data: {
      authorities: ['ROLE_USER'],
      pageTitle: 'secondApp.bookmark.home.title'
    },
    canActivate: [UserRouteAccessService]
  }
];

export const bookmarkPopupRoute: Routes = [
  {
    path: ':id/delete',
    component: BookmarkDeletePopupComponent,
    resolve: {
      bookmark: BookmarkResolve
    },
    data: {
      authorities: ['ROLE_USER'],
      pageTitle: 'secondApp.bookmark.home.title'
    },
    canActivate: [UserRouteAccessService],
    outlet: 'popup'
  }
];
