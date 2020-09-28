import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';
import { JhiLanguageService } from 'ng-jhipster';
import { JhiLanguageHelper } from 'app/core';

import { SecondAppSharedModule } from 'app/shared';
import {
  AccountEntityComponent,
  AccountEntityDetailComponent,
  AccountEntityUpdateComponent,
  AccountEntityDeletePopupComponent,
  AccountEntityDeleteDialogComponent,
  accountEntityRoute,
  accountEntityPopupRoute
} from './';

const ENTITY_STATES = [...accountEntityRoute, ...accountEntityPopupRoute];

@NgModule({
  imports: [SecondAppSharedModule, RouterModule.forChild(ENTITY_STATES)],
  declarations: [
    AccountEntityComponent,
    AccountEntityDetailComponent,
    AccountEntityUpdateComponent,
    AccountEntityDeleteDialogComponent,
    AccountEntityDeletePopupComponent
  ],
  entryComponents: [
    AccountEntityComponent,
    AccountEntityUpdateComponent,
    AccountEntityDeleteDialogComponent,
    AccountEntityDeletePopupComponent
  ],
  providers: [{ provide: JhiLanguageService, useClass: JhiLanguageService }],
  schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class SecondAppAccountEntityModule {
  constructor(private languageService: JhiLanguageService, private languageHelper: JhiLanguageHelper) {
    this.languageHelper.language.subscribe((languageKey: string) => {
      if (languageKey !== undefined) {
        this.languageService.changeLanguage(languageKey);
      }
    });
  }
}
