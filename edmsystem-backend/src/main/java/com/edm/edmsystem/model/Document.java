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
    @Setter(AccessLevel.NONE)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Long id;

    private DocumentType documentType;

    private DocumentStatus documentStatus;

    private String documentNumber;

    private String correctedInvoiceNumber;

    private String documentDescription;

    private LocalDate receiptDate;
    private LocalDate saleDate;
    private LocalDate issueDate;
    private Boolean splitPayment;
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

    @OneToOne(cascade = CascadeType.ALL, optional = false, orphanRemoval = true)
    @EqualsAndHashCode.Exclude
    private DocumentScan scan;
}

