import {Currency} from "../../../domain/currency/currency";

export class PaymentResource {
  private readonly _bankAccountNumber: string;
  private readonly _exchangeRate: number;
  private readonly _grossAmount: number;
  private readonly _netAmount: number;
  private readonly _vatAmount: number;
  private readonly _vatRate: number;
  private readonly _dueDate: Date;
  private readonly _currency: Currency;

  constructor(
    bankAccountNumber: string,
    exchangeRate: number,
    grossAmount: number,
    netAmount: number,
    vatAmount: number,
    vatRate: number,
    dueDate: Date,
    currency: Currency
  ) {
    this._bankAccountNumber = bankAccountNumber;
    this._exchangeRate = exchangeRate;
    this._grossAmount = grossAmount;
    this._netAmount = netAmount;
    this._vatAmount = vatAmount;
    this._vatRate = vatRate;
    this._dueDate = dueDate;
    this._currency = currency;
  }
}
