import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddCitationComponent } from './add.component';

describe('AddCitationComponent', () => {
  let component: AddCitationComponent;
  let fixture: ComponentFixture<AddCitationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddCitationComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AddCitationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
