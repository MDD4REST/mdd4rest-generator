import { Component, OnInit, OnDestroy } from '@angular/core';
import { HttpErrorResponse, HttpResponse } from '@angular/common/http';
import { Subscription } from 'rxjs';
import { filter, map } from 'rxjs/operators';
import { JhiEventManager, JhiAlertService } from 'ng-jhipster';

import { IBookmark } from 'app/shared/model/bookmark.model';
import { AccountService } from 'app/core';
import { BookmarkService } from './bookmark.service';

@Component({
  selector: 'jhi-bookmark',
  templateUrl: './bookmark.component.html'
})
export class BookmarkComponent implements OnInit, OnDestroy {
  bookmarks: IBookmark[];
  currentAccount: any;
  eventSubscriber: Subscription;

  constructor(
    protected bookmarkService: BookmarkService,
    protected jhiAlertService: JhiAlertService,
    protected eventManager: JhiEventManager,
    protected accountService: AccountService
  ) {}

  loadAll() {
    this.bookmarkService
      .query()
      .pipe(
        filter((res: HttpResponse<IBookmark[]>) => res.ok),
        map((res: HttpResponse<IBookmark[]>) => res.body)
      )
      .subscribe(
        (res: IBookmark[]) => {
          this.bookmarks = res;
        },
        (res: HttpErrorResponse) => this.onError(res.message)
      );
  }

  ngOnInit() {
    this.loadAll();
    this.accountService.identity().then(account => {
      this.currentAccount = account;
    });
    this.registerChangeInBookmarks();
  }

  ngOnDestroy() {
    this.eventManager.destroy(this.eventSubscriber);
  }

  trackId(index: number, item: IBookmark) {
    return item.id;
  }

  registerChangeInBookmarks() {
    this.eventSubscriber = this.eventManager.subscribe('bookmarkListModification', response => this.loadAll());
  }

  protected onError(errorMessage: string) {
    this.jhiAlertService.error(errorMessage, null, null);
  }
}
