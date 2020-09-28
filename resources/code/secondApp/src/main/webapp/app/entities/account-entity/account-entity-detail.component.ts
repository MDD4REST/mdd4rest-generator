import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

import { IAccountEntity } from 'app/shared/model/account-entity.model';

@Component({
  selector: 'jhi-account-entity-detail',
  templateUrl: './account-entity-detail.component.html'
})
export class AccountEntityDetailComponent implements OnInit {
  accountEntity: IAccountEntity;

  constructor(protected activatedRoute: ActivatedRoute) {}

  ngOnInit() {
    this.activatedRoute.data.subscribe(({ accountEntity }) => {
      this.accountEntity = accountEntity;
    });
  }

  previousState() {
    window.history.back();
  }
}
