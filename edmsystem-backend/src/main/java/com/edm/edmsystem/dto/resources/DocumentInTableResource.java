package com.edm.edmsystem.dto.resources;

import com.edm.edmsystem.model.DocumentType;
import lombok.Builder;
import lombok.extern.jackson.Jacksonized;

import java.time.LocalDate;

@Builder
@Jacksonized
public record DocumentInTableResource(
        Long id,
        DocumentType documentType,
        String documentNumber,
        LocalDate receiptDate,
        LocalDate saleDate,
        LocalDate issueDate,
        PaymentInTableResource payment,
        CompanyInTableResource supplierCompany,
        CompanyInTableResource recipientCompany
) {
}
