package com.edm.edmsystem.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.w3c.dom.DocumentType;

import java.time.LocalDate;


@Data
@NoArgsConstructor
@Entity
@Table(name = "DOCUMENTS")
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
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

