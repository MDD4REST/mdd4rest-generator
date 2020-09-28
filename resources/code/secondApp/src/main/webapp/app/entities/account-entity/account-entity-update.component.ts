import { Component, OnInit } from '@angular/core';
import { HttpResponse, HttpErrorResponse } from '@angular/common/http';
import { FormBuilder, Validators } from '@angular/forms';
import { ActivatedRoute } from '@angular/router';
import { Observable } from 'rxjs';
import { filter, map } from 'rxjs/operators';
import { JhiAlertService } from 'ng-jhipster';
import { IAccountEntity, AccountEntity } from 'app/shared/model/account-entity.model';
import { AccountEntityService } from './account-entity.service';
import { IBookmark } from 'app/shared/model/bookmark.model';
import { BookmarkService } from 'app/entities/bookmark';

@Component({
  selector: 'jhi-account-entity-update',
  templateUrl: './account-entity-update.component.html'
})
export class AccountEntityUpdateComponent implements OnInit {
  isSaving: boolean;

  bookmarks: IBookmark[];

  editForm = this.fb.group({
    id: [],
    username: [],
    password: [],
    bookmark: []
  });

  constructor(
    protected jhiAlertService: JhiAlertService,
    protected accountEntityService: AccountEntityService,
    protected bookmarkService: BookmarkService,
    protected activatedRoute: ActivatedRoute,
    private fb: FormBuilder
  ) {}

  ngOnInit() {
    this.isSaving = false;
    this.activatedRoute.data.subscribe(({ accountEntity }) => {
      this.updateForm(accountEntity);
    });
    this.bookmarkService
      .query()
      .pipe(
        filter((mayBeOk: HttpResponse<IBookmark[]>) => mayBeOk.ok),
        map((response: HttpResponse<IBookmark[]>) => response.body)
      )
      .subscribe((res: IBookmark[]) => (this.bookmarks = res), (res: HttpErrorResponse) => this.onError(res.message));
  }

  updateForm(accountEntity: IAccountEntity) {
    this.editForm.patchValue({
      id: accountEntity.id,
      username: accountEntity.username,
      password: accountEntity.password,
      bookmark: accountEntity.bookmark
    });
  }

  previousState() {
    window.history.back();
  }

  save() {
    this.isSaving = true;
    const accountEntity = this.createFromForm();
    if (accountEntity.id !== undefined) {
      this.subscribeToSaveResponse(this.accountEntityService.update(accountEntity));
    } else {
      this.subscribeToSaveResponse(this.accountEntityService.create(accountEntity));
    }
  }

  private createFromForm(): IAccountEntity {
    return {
      ...new AccountEntity(),
      id: this.editForm.get(['id']).value,
      username: this.editForm.get(['username']).value,
      password: this.editForm.get(['password']).value,
      bookmark: this.editForm.get(['bookmark']).value
    };
  }

  protected subscribeToSaveResponse(result: Observable<HttpResponse<IAccountEntity>>) {
    result.subscribe(() => this.onSaveSuccess(), () => this.onSaveError());
  }

  protected onSaveSuccess() {
    this.isSaving = false;
    this.previousState();
  }

  protected onSaveError() {
    this.isSaving = false;
  }
  protected onError(errorMessage: string) {
    this.jhiAlertService.error(errorMessage, null, null);
  }

  trackBookmarkById(index: number, item: IBookmark) {
    return item.id;
  }
}
