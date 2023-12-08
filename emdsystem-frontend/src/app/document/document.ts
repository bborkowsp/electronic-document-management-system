import {Payment} from "./domain/payment/payment";
import {Company} from "./domain/company/company";
import {DocumentsType} from "./domain/document-type/documents-type.enum";

export class Document {
  constructor(
    public documentId = 0,
    public supplierCompany: Company | null = null,
    public recipientCompany: Company | null = null,
    public documentType: DocumentsType | null = null,
    public issueDate: Date | null = null,
    public saleDate: Date | null = null,
    public receiptDate: Date | null = null,
    public documentNumber = '',
    public payment: Payment | null = null
  ) {
  }
}
