import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';
import { JhiLanguageService } from 'ng-jhipster';
import { JhiLanguageHelper } from 'app/core';

import { SecondAppSharedModule } from 'app/shared';
import {
  BookmarkComponent,
  BookmarkDetailComponent,
  BookmarkUpdateComponent,
  BookmarkDeletePopupComponent,
  BookmarkDeleteDialogComponent,
  bookmarkRoute,
  bookmarkPopupRoute
} from './';

const ENTITY_STATES = [...bookmarkRoute, ...bookmarkPopupRoute];

@NgModule({
  imports: [SecondAppSharedModule, RouterModule.forChild(ENTITY_STATES)],
  declarations: [
    BookmarkComponent,
    BookmarkDetailComponent,
    BookmarkUpdateComponent,
    BookmarkDeleteDialogComponent,
    BookmarkDeletePopupComponent
  ],
  entryComponents: [BookmarkComponent, BookmarkUpdateComponent, BookmarkDeleteDialogComponent, BookmarkDeletePopupComponent],
  providers: [{ provide: JhiLanguageService, useClass: JhiLanguageService }],
  schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class SecondAppBookmarkModule {
  constructor(private languageService: JhiLanguageService, private languageHelper: JhiLanguageHelper) {
    this.languageHelper.language.subscribe((languageKey: string) => {
      if (languageKey !== undefined) {
        this.languageService.changeLanguage(languageKey);
      }
    });
  }
}
