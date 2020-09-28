import { Component, OnInit } from '@angular/core';
import { HttpResponse, HttpErrorResponse } from '@angular/common/http';
import { FormBuilder, Validators } from '@angular/forms';
import { ActivatedRoute } from '@angular/router';
import { Observable } from 'rxjs';
import { filter, map } from 'rxjs/operators';
import { JhiAlertService } from 'ng-jhipster';
import { IBookmark, Bookmark } from 'app/shared/model/bookmark.model';
import { BookmarkService } from './bookmark.service';
import { ITag } from 'app/shared/model/tag.model';
import { TagService } from 'app/entities/tag';

@Component({
  selector: 'jhi-bookmark-update',
  templateUrl: './bookmark-update.component.html'
})
export class BookmarkUpdateComponent implements OnInit {
  isSaving: boolean;

  tags: ITag[];

  editForm = this.fb.group({
    id: [],
    bookmarkName: [],
    bookmarkUrl: [],
    visibility: [],
    tag: []
  });

  constructor(
    protected jhiAlertService: JhiAlertService,
    protected bookmarkService: BookmarkService,
    protected tagService: TagService,
    protected activatedRoute: ActivatedRoute,
    private fb: FormBuilder
  ) {}

  ngOnInit() {
    this.isSaving = false;
    this.activatedRoute.data.subscribe(({ bookmark }) => {
      this.updateForm(bookmark);
    });
    this.tagService
      .query()
      .pipe(
        filter((mayBeOk: HttpResponse<ITag[]>) => mayBeOk.ok),
        map((response: HttpResponse<ITag[]>) => response.body)
      )
      .subscribe((res: ITag[]) => (this.tags = res), (res: HttpErrorResponse) => this.onError(res.message));
  }

  updateForm(bookmark: IBookmark) {
    this.editForm.patchValue({
      id: bookmark.id,
      bookmarkName: bookmark.bookmarkName,
      bookmarkUrl: bookmark.bookmarkUrl,
      visibility: bookmark.visibility,
      tag: bookmark.tag
    });
  }

  previousState() {
    window.history.back();
  }

  save() {
    this.isSaving = true;
    const bookmark = this.createFromForm();
    if (bookmark.id !== undefined) {
      this.subscribeToSaveResponse(this.bookmarkService.update(bookmark));
    } else {
      this.subscribeToSaveResponse(this.bookmarkService.create(bookmark));
    }
  }

  private createFromForm(): IBookmark {
    return {
      ...new Bookmark(),
      id: this.editForm.get(['id']).value,
      bookmarkName: this.editForm.get(['bookmarkName']).value,
      bookmarkUrl: this.editForm.get(['bookmarkUrl']).value,
      visibility: this.editForm.get(['visibility']).value,
      tag: this.editForm.get(['tag']).value
    };
  }

  protected subscribeToSaveResponse(result: Observable<HttpResponse<IBookmark>>) {
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

  trackTagById(index: number, item: ITag) {
    return item.id;
  }
}
