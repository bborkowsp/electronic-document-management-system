package com.edm.edmsystem.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.time.LocalDate;

@Value
@Builder
@Embeddable
@AllArgsConstructor
@NoArgsConstructor(force = true)
public class Payment {

    String bankAccountNumber;
    double exchangeRate;
    double grossAmount;
    double netAmount;
    double vatAmount;
    double vatRate;
    LocalDate dueDate;
    Currency currency;
}
