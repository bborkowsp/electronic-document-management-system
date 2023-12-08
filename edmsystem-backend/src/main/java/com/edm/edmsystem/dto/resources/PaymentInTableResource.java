package com.edm.edmsystem.dto.resources;

import com.edm.edmsystem.model.Currency;
import lombok.Builder;
import lombok.extern.jackson.Jacksonized;

@Builder
@Jacksonized
public record PaymentInTableResource(
        double grossAmount,
        double netAmount,
        Currency currency
) {

}
