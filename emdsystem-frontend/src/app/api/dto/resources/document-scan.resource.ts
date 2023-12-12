export class DocumentScanResource {
  private readonly _encodedPdf: string;

  constructor(encodedPdf: string) {
    this._encodedPdf = encodedPdf;
  }

  get encodedPdf(): string {
    return this._encodedPdf;
  }
}
