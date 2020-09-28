/* tslint:disable max-line-length */
import { ComponentFixture, TestBed, fakeAsync, tick } from '@angular/core/testing';
import { HttpResponse } from '@angular/common/http';
import { FormBuilder } from '@angular/forms';
import { Observable, of } from 'rxjs';

import { SecondAppTestModule } from '../../../test.module';
import { BookmarkUpdateComponent } from 'app/entities/bookmark/bookmark-update.component';
import { BookmarkService } from 'app/entities/bookmark/bookmark.service';
import { Bookmark } from 'app/shared/model/bookmark.model';

describe('Component Tests', () => {
  describe('Bookmark Management Update Component', () => {
    let comp: BookmarkUpdateComponent;
    let fixture: ComponentFixture<BookmarkUpdateComponent>;
    let service: BookmarkService;

    beforeEach(() => {
      TestBed.configureTestingModule({
        imports: [SecondAppTestModule],
        declarations: [BookmarkUpdateComponent],
        providers: [FormBuilder]
      })
        .overrideTemplate(BookmarkUpdateComponent, '')
        .compileComponents();

      fixture = TestBed.createComponent(BookmarkUpdateComponent);
      comp = fixture.componentInstance;
      service = fixture.debugElement.injector.get(BookmarkService);
    });

    describe('save', () => {
      it('Should call update service on save for existing entity', fakeAsync(() => {
        // GIVEN
        const entity = new Bookmark(123);
        spyOn(service, 'update').and.returnValue(of(new HttpResponse({ body: entity })));
        comp.updateForm(entity);
        // WHEN
        comp.save();
        tick(); // simulate async

        // THEN
        expect(service.update).toHaveBeenCalledWith(entity);
        expect(comp.isSaving).toEqual(false);
      }));

      it('Should call create service on save for new entity', fakeAsync(() => {
        // GIVEN
        const entity = new Bookmark();
        spyOn(service, 'create').and.returnValue(of(new HttpResponse({ body: entity })));
        comp.updateForm(entity);
        // WHEN
        comp.save();
        tick(); // simulate async

        // THEN
        expect(service.create).toHaveBeenCalledWith(entity);
        expect(comp.isSaving).toEqual(false);
      }));
    });
  });
});
