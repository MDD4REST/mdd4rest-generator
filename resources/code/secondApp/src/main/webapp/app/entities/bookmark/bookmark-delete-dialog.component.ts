import { Component, OnInit, OnDestroy } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

import { NgbActiveModal, NgbModal, NgbModalRef } from '@ng-bootstrap/ng-bootstrap';
import { JhiEventManager } from 'ng-jhipster';

import { IBookmark } from 'app/shared/model/bookmark.model';
import { BookmarkService } from './bookmark.service';

@Component({
  selector: 'jhi-bookmark-delete-dialog',
  templateUrl: './bookmark-delete-dialog.component.html'
})
export class BookmarkDeleteDialogComponent {
  bookmark: IBookmark;

  constructor(protected bookmarkService: BookmarkService, public activeModal: NgbActiveModal, protected eventManager: JhiEventManager) {}

  clear() {
    this.activeModal.dismiss('cancel');
  }

  confirmDelete(id: number) {
    this.bookmarkService.delete(id).subscribe(response => {
      this.eventManager.broadcast({
        name: 'bookmarkListModification',
        content: 'Deleted an bookmark'
      });
      this.activeModal.dismiss(true);
    });
  }
}

@Component({
  selector: 'jhi-bookmark-delete-popup',
  template: ''
})
export class BookmarkDeletePopupComponent implements OnInit, OnDestroy {
  protected ngbModalRef: NgbModalRef;

  constructor(protected activatedRoute: ActivatedRoute, protected router: Router, protected modalService: NgbModal) {}

  ngOnInit() {
    this.activatedRoute.data.subscribe(({ bookmark }) => {
      setTimeout(() => {
        this.ngbModalRef = this.modalService.open(BookmarkDeleteDialogComponent as Component, { size: 'lg', backdrop: 'static' });
        this.ngbModalRef.componentInstance.bookmark = bookmark;
        this.ngbModalRef.result.then(
          result => {
            this.router.navigate(['/bookmark', { outlets: { popup: null } }]);
            this.ngbModalRef = null;
          },
          reason => {
            this.router.navigate(['/bookmark', { outlets: { popup: null } }]);
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
