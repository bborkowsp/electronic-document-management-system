package com.edm.edmsystem.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@Entity
@Table(name = "PAYMENTS")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String bankAccountNumber;
    private double exchangeRate;
    private double grossAmount;
    private double netAmount;
    private double VATAmount;
    private double VATRate;
    private LocalDate dueDate;

    @OneToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "document_id")
    private Document document;
}
