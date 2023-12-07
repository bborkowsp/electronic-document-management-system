package com.edm.edmsystem.dto.resources;

import com.edm.edmsystem.model.Currency;
import lombok.Builder;
import lombok.extern.jackson.Jacksonized;

import java.time.LocalDate;

@Builder
@Jacksonized
public record PaymentResouce(
        String bankAccountNumber,
        double exchangeRate,
        double grossAmount,
        double netAmount,
        double vatAmount,
        double vatRate,
        LocalDate dueDate,
        Currency currency
) {

}
