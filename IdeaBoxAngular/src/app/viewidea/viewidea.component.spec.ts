import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewideaComponent } from './viewidea.component';

describe('ViewideaComponent', () => {
  let component: ViewideaComponent;
  let fixture: ComponentFixture<ViewideaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ViewideaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ViewideaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
