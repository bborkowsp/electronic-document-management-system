import {DocumentsType} from "../../../domain/document-type/documents-type";
import {PaymentResource} from "./payment.resource";
import {DocumentScanResource} from "./document-scan.resource";
import {CompanyResource} from "./company.resource";
import {DocumentStatusResource} from "./document-status.resource";
import {DocumentChangeHistoryResource} from "./document-change-history.resource";

export class DocumentResource {
  private readonly _id: number;
  _documentType: DocumentsType;
  private readonly _documentStatus: DocumentStatusResource;
  _documentNumber: string;
  _correctedInvoiceNumber: string;
  _documentDescription: string;
  _receiptDate: Date;
  _saleDate: Date;
  _issueDate: Date;
  _splitPayment: boolean;
  _isElectronicDocument: boolean;
  _supplierCompanyResource: CompanyResource;
  _recipientCompanyResource: CompanyResource;
  _documentChangeHistory: DocumentChangeHistoryResource;
  _paymentResource: PaymentResource;
  _documentScanResource: DocumentScanResource;

  constructor(
    id: number,
    documentType: DocumentsType,
    documentStatus: DocumentStatusResource,
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
    documentChangeHistory: DocumentChangeHistoryResource,
    paymentResource: PaymentResource,
    documentScanResource: DocumentScanResource
  ) {
    this._id = id;
    this._documentType = documentType;
    this._documentStatus = documentStatus;
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
    this._documentChangeHistory = documentChangeHistory;
    this._paymentResource = paymentResource;
    this._documentScanResource = documentScanResource;
  }

  get id(): number {
    return this._id;
  }

  get documentType(): DocumentsType {
    return this._documentType;
  }

  get documentStatus(): DocumentStatusResource {
    return this._documentStatus;
  }

  get documentNumber(): string {
    return this._documentNumber;
  }

  get correctedInvoiceNumber(): string {
    return this._correctedInvoiceNumber;
  }

  get documentDescription(): string {
    return this._documentDescription;
  }

  get receiptDate(): Date {
    return this._receiptDate;
  }

  get saleDate(): Date {
    return this._saleDate;
  }

  get issueDate(): Date {
    return this._issueDate;
  }

  get splitPayment(): boolean {
    return this._splitPayment;
  }

  get isElectronicDocument(): boolean {
    return this._isElectronicDocument;
  }

  get supplierCompanyResource(): CompanyResource {
    return this._supplierCompanyResource;
  }

  get recipientCompanyResource(): CompanyResource {
    return this._recipientCompanyResource;
  }

  get documentChangeHistory(): DocumentChangeHistoryResource {
    return this._documentChangeHistory;
  }

  get paymentResource(): PaymentResource {
    return this._paymentResource;
  }

  get documentScanResource(): DocumentScanResource {
    return this._documentScanResource;
  }

  set documentType(value: DocumentsType) {
    this._documentType = value;
  }

  set documentNumber(value: string) {
    this._documentNumber = value;
  }

  set correctedInvoiceNumber(value: string) {
    this._correctedInvoiceNumber = value;
  }

  set documentDescription(value: string) {
    this._documentDescription = value;
  }

  set receiptDate(value: Date) {
    this._receiptDate = value;
  }

  set saleDate(value: Date) {
    this._saleDate = value;
  }

  set issueDate(value: Date) {
    this._issueDate = value;
  }

  set splitPayment(value: boolean) {
    this._splitPayment = value;
  }

  set isElectronicDocument(value: boolean) {
    this._isElectronicDocument = value;
  }

  set supplierCompanyResource(value: CompanyResource) {
    this._supplierCompanyResource = value;
  }

  set recipientCompanyResource(value: CompanyResource) {
    this._recipientCompanyResource = value;
  }
}
