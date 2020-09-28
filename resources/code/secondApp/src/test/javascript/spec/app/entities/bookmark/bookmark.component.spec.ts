/* tslint:disable max-line-length */
import { ComponentFixture, TestBed } from '@angular/core/testing';
import { Observable, of } from 'rxjs';
import { HttpHeaders, HttpResponse } from '@angular/common/http';

import { SecondAppTestModule } from '../../../test.module';
import { BookmarkComponent } from 'app/entities/bookmark/bookmark.component';
import { BookmarkService } from 'app/entities/bookmark/bookmark.service';
import { Bookmark } from 'app/shared/model/bookmark.model';

describe('Component Tests', () => {
  describe('Bookmark Management Component', () => {
    let comp: BookmarkComponent;
    let fixture: ComponentFixture<BookmarkComponent>;
    let service: BookmarkService;

    beforeEach(() => {
      TestBed.configureTestingModule({
        imports: [SecondAppTestModule],
        declarations: [BookmarkComponent],
        providers: []
      })
        .overrideTemplate(BookmarkComponent, '')
        .compileComponents();

      fixture = TestBed.createComponent(BookmarkComponent);
      comp = fixture.componentInstance;
      service = fixture.debugElement.injector.get(BookmarkService);
    });

    it('Should call load all on init', () => {
      // GIVEN
      const headers = new HttpHeaders().append('link', 'link;link');
      spyOn(service, 'query').and.returnValue(
        of(
          new HttpResponse({
            body: [new Bookmark(123)],
            headers
          })
        )
      );

      // WHEN
      comp.ngOnInit();

      // THEN
      expect(service.query).toHaveBeenCalled();
      expect(comp.bookmarks[0]).toEqual(jasmine.objectContaining({ id: 123 }));
    });
  });
});
