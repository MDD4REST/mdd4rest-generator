import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { FirstAppSharedCommonModule, JhiLoginModalComponent, HasAnyAuthorityDirective } from './';

@NgModule({
  imports: [FirstAppSharedCommonModule],
  declarations: [JhiLoginModalComponent, HasAnyAuthorityDirective],
  entryComponents: [JhiLoginModalComponent],
  exports: [FirstAppSharedCommonModule, JhiLoginModalComponent, HasAnyAuthorityDirective],
  schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class FirstAppSharedModule {
  static forRoot() {
    return {
      ngModule: FirstAppSharedModule
    };
  }
}
