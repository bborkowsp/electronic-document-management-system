import {Currency} from "../currency/currency";

export class Payment {
    constructor(
        public grossAmount = 0,
        public netAmount = 0,
        public currency: Currency | null = null
    ) {
    }
}
