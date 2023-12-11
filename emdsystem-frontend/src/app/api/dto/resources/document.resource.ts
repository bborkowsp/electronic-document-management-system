import {DocumentsType} from "../../../documents/domain/document-type/documents-type";
import {Company} from "../../../documents/domain/company/company";
import {Payment} from "../../../documents/domain/payment/payment";

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
  private readonly _supplierCompanyResource: Company;
  private readonly _recipientCompanyResource: Company;
  private readonly _paymentResource: Payment;

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
    supplierCompanyResource: Company,
    recipientCompanyResource: Company,
    paymentResource: Payment
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
  ) {
  }
 }
}
