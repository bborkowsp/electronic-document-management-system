package com.edm.edmsystem.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;


@Data
@Entity
@AllArgsConstructor
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private DocumentType documentType;

    private DocumentStatus documentStatus;

    @Column(nullable = false)
    private String documentNumber;

    private String correctedInvoiceNumber;

    @Column(nullable = false)
    private String documentDescription;

    @Column(nullable = false)
    private LocalDate receiptDate;
    @Column(nullable = false)
    private LocalDate saleDate;
    @Column(nullable = false)
    private LocalDate issueDate;
    @Column(nullable = false)
    private Boolean splitPayment;
    @Column(nullable = false)
    private Boolean isElectronicDocument;


    @OneToOne(cascade = CascadeType.ALL)
    private Company supplierCompany;


    @OneToOne(cascade = CascadeType.ALL)
    private Company recipientCompany;


    @OneToOne(cascade = CascadeType.ALL)
    private Property property;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<DocumentHistory> documentChangeHistory;

    @Embedded
    private Payment payment;
}

