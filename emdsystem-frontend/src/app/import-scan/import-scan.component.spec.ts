import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ImportScanComponent } from './import-scan.component';

describe('ImportScanComponent', () => {
  let component: ImportScanComponent;
  let fixture: ComponentFixture<ImportScanComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ImportScanComponent]
    });
    fixture = TestBed.createComponent(ImportScanComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
