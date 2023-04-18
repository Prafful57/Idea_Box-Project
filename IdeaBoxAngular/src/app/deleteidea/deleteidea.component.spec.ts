import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DeleteideaComponent } from './deleteidea.component';

describe('DeleteideaComponent', () => {
  let component: DeleteideaComponent;
  let fixture: ComponentFixture<DeleteideaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DeleteideaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DeleteideaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
