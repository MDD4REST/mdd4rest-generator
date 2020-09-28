import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

import { IBookmark } from 'app/shared/model/bookmark.model';

@Component({
  selector: 'jhi-bookmark-detail',
  templateUrl: './bookmark-detail.component.html'
})
export class BookmarkDetailComponent implements OnInit {
  bookmark: IBookmark;

  constructor(protected activatedRoute: ActivatedRoute) {}

  ngOnInit() {
    this.activatedRoute.data.subscribe(({ bookmark }) => {
      this.bookmark = bookmark;
    });
  }

  previousState() {
    window.history.back();
  }
}
