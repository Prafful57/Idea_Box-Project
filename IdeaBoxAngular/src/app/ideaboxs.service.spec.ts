import { TestBed } from '@angular/core/testing';

import { IdeaboxsService } from './ideaboxs.service';

describe('IdeaboxsService', () => {
  let service: IdeaboxsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(IdeaboxsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
