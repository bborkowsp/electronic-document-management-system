package com.edm.edmsystem.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Value
@Embeddable
@NoArgsConstructor(force = true)
@AllArgsConstructor
@Builder
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
