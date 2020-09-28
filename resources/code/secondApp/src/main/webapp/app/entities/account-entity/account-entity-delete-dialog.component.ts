import { Component, OnInit, OnDestroy } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

import { NgbActiveModal, NgbModal, NgbModalRef } from '@ng-bootstrap/ng-bootstrap';
import { JhiEventManager } from 'ng-jhipster';

import { IAccountEntity } from 'app/shared/model/account-entity.model';
import { AccountEntityService } from './account-entity.service';

@Component({
  selector: 'jhi-account-entity-delete-dialog',
  templateUrl: './account-entity-delete-dialog.component.html'
})
export class AccountEntityDeleteDialogComponent {
  accountEntity: IAccountEntity;

  constructor(
    protected accountEntityService: AccountEntityService,
    public activeModal: NgbActiveModal,
    protected eventManager: JhiEventManager
  ) {}

  clear() {
    this.activeModal.dismiss('cancel');
  }

  confirmDelete(id: number) {
    this.accountEntityService.delete(id).subscribe(response => {
      this.eventManager.broadcast({
        name: 'accountEntityListModification',
        content: 'Deleted an accountEntity'
      });
      this.activeModal.dismiss(true);
    });
  }
}

@Component({
  selector: 'jhi-account-entity-delete-popup',
  template: ''
})
export class AccountEntityDeletePopupComponent implements OnInit, OnDestroy {
  protected ngbModalRef: NgbModalRef;

  constructor(protected activatedRoute: ActivatedRoute, protected router: Router, protected modalService: NgbModal) {}

  ngOnInit() {
    this.activatedRoute.data.subscribe(({ accountEntity }) => {
      setTimeout(() => {
        this.ngbModalRef = this.modalService.open(AccountEntityDeleteDialogComponent as Component, { size: 'lg', backdrop: 'static' });
        this.ngbModalRef.componentInstance.accountEntity = accountEntity;
        this.ngbModalRef.result.then(
          result => {
            this.router.navigate(['/account-entity', { outlets: { popup: null } }]);
            this.ngbModalRef = null;
          },
          reason => {
            this.router.navigate(['/account-entity', { outlets: { popup: null } }]);
            this.ngbModalRef = null;
          }
        );
      }, 0);
    });
  }

  ngOnDestroy() {
    this.ngbModalRef = null;
  }
}
