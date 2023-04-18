import { TestBed } from '@angular/core/testing';

import { IdeaserviceService } from './ideaservice.service';

describe('IdeaserviceService', () => {
  let service: IdeaserviceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(IdeaserviceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
