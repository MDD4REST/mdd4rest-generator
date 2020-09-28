import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';

@NgModule({
  imports: [
    RouterModule.forChild([
      {
        path: 'tag',
        loadChildren: './tag/tag.module#SecondAppTagModule'
      },
      {
        path: 'bookmark',
        loadChildren: './bookmark/bookmark.module#SecondAppBookmarkModule'
      },
      {
        path: 'account-entity',
        loadChildren: './account-entity/account-entity.module#SecondAppAccountEntityModule'
      }
      /* jhipster-needle-add-entity-route - JHipster will add entity modules routes here */
    ])
  ],
  declarations: [],
  entryComponents: [],
  providers: [],
  schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class SecondAppEntityModule {}
