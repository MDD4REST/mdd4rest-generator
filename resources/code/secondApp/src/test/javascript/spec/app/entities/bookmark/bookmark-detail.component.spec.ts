/* tslint:disable max-line-length */
import { ComponentFixture, TestBed } from '@angular/core/testing';
import { ActivatedRoute } from '@angular/router';
import { of } from 'rxjs';

import { SecondAppTestModule } from '../../../test.module';
import { BookmarkDetailComponent } from 'app/entities/bookmark/bookmark-detail.component';
import { Bookmark } from 'app/shared/model/bookmark.model';

describe('Component Tests', () => {
  describe('Bookmark Management Detail Component', () => {
    let comp: BookmarkDetailComponent;
    let fixture: ComponentFixture<BookmarkDetailComponent>;
    const route = ({ data: of({ bookmark: new Bookmark(123) }) } as any) as ActivatedRoute;

    beforeEach(() => {
      TestBed.configureTestingModule({
        imports: [SecondAppTestModule],
        declarations: [BookmarkDetailComponent],
        providers: [{ provide: ActivatedRoute, useValue: route }]
      })
        .overrideTemplate(BookmarkDetailComponent, '')
        .compileComponents();
      fixture = TestBed.createComponent(BookmarkDetailComponent);
      comp = fixture.componentInstance;
    });

    describe('OnInit', () => {
      it('Should call load all on init', () => {
        // GIVEN

        // WHEN
        comp.ngOnInit();

        // THEN
        expect(comp.bookmark).toEqual(jasmine.objectContaining({ id: 123 }));
      });
    });
  });
});
