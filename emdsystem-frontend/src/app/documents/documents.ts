import {Payment} from "./domain/payment/payment";
import {Company} from "./domain/company/company";
import {DocumentsType} from "./domain/document-type/documents-type";

export class Documents {
  constructor(
    public id = 0,
    public documentType: DocumentsType | null = null,
    public documentNumber = '',
    public receiptDate: Date | null = null,
    public saleDate: Date | null = null,
    public issueDate: Date | null = null,
    public payment: Payment | null = null,
    public supplierCompany: Company | null = null,
    public recipientCompany: Company | null = null,
  ) {
  }
}
