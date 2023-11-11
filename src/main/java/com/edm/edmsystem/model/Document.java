package com.edm.edmsystem.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.edm.edmsystem.model.DocumentType;

import java.time.LocalDate;


@Data
@NoArgsConstructor
@Entity
@Table(name = "DOCUMENTS")
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private DocumentType documentType;
    private String documentNumber;
    private String correctedInvoiceNumber;
    private String documentDescription;
    private LocalDate receiptDate;
    private LocalDate saleDate;
    private LocalDate issueDate;
    private boolean splitPayment;
    private boolean isElectronicDocument;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "supplier_company_id")
    private Company supplierCompany;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "recipient_company_id")
    private Company recipientCompany;
}

