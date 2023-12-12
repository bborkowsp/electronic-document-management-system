import {Currency} from "../../../domain/currency/currency";

export class PaymentResource {
  _bankAccountNumber: string;
  _exchangeRate: number;
  _grossAmount: number;
  _netAmount: number;
  _vatAmount: number;
  _vatRate: number;
  _dueDate: Date;
  _currency: Currency;

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

  get bankAccountNumber(): string {
    return this._bankAccountNumber;
  }

  get exchangeRate(): number {
    return this._exchangeRate;
  }

  get grossAmount(): number {
    return this._grossAmount;
  }

  get netAmount(): number {
    return this._netAmount;
  }

  get vatAmount(): number {
    return this._vatAmount;
  }

  get vatRate(): number {
    return this._vatRate;
  }

  get dueDate(): Date {
    return this._dueDate;
  }

  get currency(): Currency {
    return this._currency;
  }

  set bankAccountNumber(value: string) {
    this._bankAccountNumber = value;
  }

  set exchangeRate(value: number) {
    this._exchangeRate = value;
  }

  set grossAmount(value: number) {
    this._grossAmount = value;
  }

  set netAmount(value: number) {
    this._netAmount = value;
  }

  set vatAmount(value: number) {
    this._vatAmount = value;
  }

  set vatRate(value: number) {
    this._vatRate = value;
  }

  set dueDate(value: Date) {
    this._dueDate = value;
  }

  set currency(value: Currency) {
    this._currency = value;
  }
}
