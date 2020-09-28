/* tslint:disable max-line-length */
import { ComponentFixture, TestBed, fakeAsync, tick } from '@angular/core/testing';
import { HttpResponse } from '@angular/common/http';
import { FormBuilder } from '@angular/forms';
import { Observable, of } from 'rxjs';

import { SecondAppTestModule } from '../../../test.module';
import { AccountEntityUpdateComponent } from 'app/entities/account-entity/account-entity-update.component';
import { AccountEntityService } from 'app/entities/account-entity/account-entity.service';
import { AccountEntity } from 'app/shared/model/account-entity.model';

describe('Component Tests', () => {
  describe('AccountEntity Management Update Component', () => {
    let comp: AccountEntityUpdateComponent;
    let fixture: ComponentFixture<AccountEntityUpdateComponent>;
    let service: AccountEntityService;

    beforeEach(() => {
      TestBed.configureTestingModule({
        imports: [SecondAppTestModule],
        declarations: [AccountEntityUpdateComponent],
        providers: [FormBuilder]
      })
        .overrideTemplate(AccountEntityUpdateComponent, '')
        .compileComponents();

      fixture = TestBed.createComponent(AccountEntityUpdateComponent);
      comp = fixture.componentInstance;
      service = fixture.debugElement.injector.get(AccountEntityService);
    });

    describe('save', () => {
      it('Should call update service on save for existing entity', fakeAsync(() => {
        // GIVEN
        const entity = new AccountEntity(123);
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
        const entity = new AccountEntity();
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
