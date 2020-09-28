import { Component, OnInit, OnDestroy } from '@angular/core';
import { HttpErrorResponse, HttpResponse } from '@angular/common/http';
import { Subscription } from 'rxjs';
import { filter, map } from 'rxjs/operators';
import { JhiEventManager, JhiAlertService } from 'ng-jhipster';

import { IAccountEntity } from 'app/shared/model/account-entity.model';
import { AccountService } from 'app/core';
import { AccountEntityService } from './account-entity.service';

@Component({
  selector: 'jhi-account-entity',
  templateUrl: './account-entity.component.html'
})
export class AccountEntityComponent implements OnInit, OnDestroy {
  accountEntities: IAccountEntity[];
  currentAccount: any;
  eventSubscriber: Subscription;

  constructor(
    protected accountEntityService: AccountEntityService,
    protected jhiAlertService: JhiAlertService,
    protected eventManager: JhiEventManager,
    protected accountService: AccountService
  ) {}

  loadAll() {
    this.accountEntityService
      .query()
      .pipe(
        filter((res: HttpResponse<IAccountEntity[]>) => res.ok),
        map((res: HttpResponse<IAccountEntity[]>) => res.body)
      )
      .subscribe(
        (res: IAccountEntity[]) => {
          this.accountEntities = res;
        },
        (res: HttpErrorResponse) => this.onError(res.message)
      );
  }

  ngOnInit() {
    this.loadAll();
    this.accountService.identity().then(account => {
      this.currentAccount = account;
    });
    this.registerChangeInAccountEntities();
  }

  ngOnDestroy() {
    this.eventManager.destroy(this.eventSubscriber);
  }

  trackId(index: number, item: IAccountEntity) {
    return item.id;
  }

  registerChangeInAccountEntities() {
    this.eventSubscriber = this.eventManager.subscribe('accountEntityListModification', response => this.loadAll());
  }

  protected onError(errorMessage: string) {
    this.jhiAlertService.error(errorMessage, null, null);
  }
}
