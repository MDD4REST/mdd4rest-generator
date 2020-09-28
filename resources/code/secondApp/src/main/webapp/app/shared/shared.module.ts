import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { SecondAppSharedCommonModule, JhiLoginModalComponent, HasAnyAuthorityDirective } from './';

@NgModule({
  imports: [SecondAppSharedCommonModule],
  declarations: [JhiLoginModalComponent, HasAnyAuthorityDirective],
  entryComponents: [JhiLoginModalComponent],
  exports: [SecondAppSharedCommonModule, JhiLoginModalComponent, HasAnyAuthorityDirective],
  schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class SecondAppSharedModule {
  static forRoot() {
    return {
      ngModule: SecondAppSharedModule
    };
  }
}
