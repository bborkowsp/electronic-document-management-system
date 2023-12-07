package com.edm.edmsystem.dto.resources;

import com.edm.edmsystem.model.DocumentStatus;
import com.edm.edmsystem.model.DocumentType;
import lombok.Builder;
import lombok.extern.jackson.Jacksonized;

import java.time.LocalDate;

@Builder
@Jacksonized
public record DocumentInTableResource(
        Long id,
        DocumentType documentType,
        DocumentStatus documentStatus,
        String documentNumber,
        String correctedInvoiceNumber,
        String documentDescription,
        LocalDate receiptDate,
        LocalDate saleDate,
        LocalDate issueDate,
        PaymentResouce payment,
        CompanyResource supplierCompany,
        CompanyResource recipientCompany
) {
}
