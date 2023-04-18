import { TestBed } from '@angular/core/testing';

import { IdeaboxService } from './ideabox.service';

describe('IdeaboxService', () => {
  let service: IdeaboxService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(IdeaboxService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
