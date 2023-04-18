import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DeletefeedbackComponent } from './deletefeedback.component';

describe('DeletefeedbackComponent', () => {
  let component: DeletefeedbackComponent;
  let fixture: ComponentFixture<DeletefeedbackComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DeletefeedbackComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DeletefeedbackComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
