import {DocumentsType} from "../../../domain/document-type/documents-type";
import {PaymentResource} from "./payment.resource";
import {DocumentScanResource} from "./document-scan.resource";
import {CompanyResource} from "./company.resource";

export class DocumentResource {
  private readonly _id: number;
  private readonly _documentType: DocumentsType;
  private readonly _documentNumber: string;
  private readonly _correctedInvoiceNumber: string;
  private readonly _documentDescription: string;
  private readonly _receiptDate: Date;
  private readonly _saleDate: Date;
  private readonly _issueDate: Date;
  private readonly _splitPayment: boolean;
  private readonly _isElectronicDocument: boolean;
  private readonly _supplierCompanyResource: CompanyResource;
  private readonly _recipientCompanyResource: CompanyResource;
  private readonly _paymentResource: PaymentResource;
  private readonly _documentScanResource: DocumentScanResource;

  constructor(
    id: number,
    documentType: DocumentsType,
    documentNumber: string,
    correctedInvoiceNumber: string,
    documentDescription: string,
    receiptDate: Date,
    saleDate: Date,
    issueDate: Date,
    splitPayment: boolean,
    isElectronicDocument: boolean,
    supplierCompanyResource: CompanyResource,
    recipientCompanyResource: CompanyResource,
    paymentResource: PaymentResource,
    documentScanResource: DocumentScanResource
  ) {
    this._id = id;
    this._documentType = documentType;
    this._documentNumber = documentNumber;
    this._correctedInvoiceNumber = correctedInvoiceNumber;
    this._documentDescription = documentDescription;
    this._receiptDate = receiptDate;
    this._saleDate = saleDate;
    this._issueDate = issueDate;
    this._splitPayment = splitPayment;
    this._isElectronicDocument = isElectronicDocument;
    this._supplierCompanyResource = supplierCompanyResource;
    this._recipientCompanyResource = recipientCompanyResource;
    this._paymentResource = paymentResource;
    this._documentScanResource = documentScanResource;
    {
    }

  }
}
