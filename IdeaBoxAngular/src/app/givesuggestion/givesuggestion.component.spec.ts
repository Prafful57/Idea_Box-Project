import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GivesuggestionComponent } from './givesuggestion.component';

describe('GivesuggestionComponent', () => {
  let component: GivesuggestionComponent;
  let fixture: ComponentFixture<GivesuggestionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ GivesuggestionComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(GivesuggestionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
