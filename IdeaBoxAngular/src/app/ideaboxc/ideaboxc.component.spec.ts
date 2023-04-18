import { ComponentFixture, TestBed } from '@angular/core/testing';

import { IdeaboxcComponent } from './ideaboxc.component';

describe('IdeaboxcComponent', () => {
  let component: IdeaboxcComponent;
  let fixture: ComponentFixture<IdeaboxcComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ IdeaboxcComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(IdeaboxcComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
