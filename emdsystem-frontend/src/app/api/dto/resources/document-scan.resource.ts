export class DocumentScanResource {
  private readonly _encodedPdf: string;

  constructor(encodedPdf: string) {
    this._encodedPdf = encodedPdf;
  }
}
