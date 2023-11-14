package com.edm.edmsystem.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.lang.NonNull;

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
    @Column(nullable = false)
    private DocumentStatus documentStatus;

    @Column(nullable = false)
    private String documentNumber;
    @Column(nullable = false)
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
    private boolean splitPayment;
    @Column(nullable = false)
    private boolean isElectronicDocument;

    @NonNull
    @OneToOne(cascade = CascadeType.ALL)
    private Company supplierCompany;

    @NonNull
    @OneToOne(cascade = CascadeType.ALL)
    private Company recipientCompany;

    @NonNull
    @OneToOne(cascade = CascadeType.ALL)
    private Property property;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @NonNull
    private List<DocumentHistory> documentChangeHistory;

    @Embedded
    @NonNull
    private Payment payment;

    @Embedded
    @NonNull
    private DocumentScan physicalProperties;

}

