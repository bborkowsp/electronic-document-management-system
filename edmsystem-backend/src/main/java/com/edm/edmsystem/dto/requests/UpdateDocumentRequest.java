package com.edm.edmsystem.dto.requests;

import com.edm.edmsystem.dto.resources.*;
import com.edm.edmsystem.model.DocumentType;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.extern.jackson.Jacksonized;

import java.time.LocalDate;

@Builder
@Jacksonized
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public record UpdateDocumentRequest(
        @NotNull @Valid DocumentType documentTypeResource,
        @NotNull @Valid DocumentStatusResource documentStatusResource,
        @NotBlank @Size(max = 50) String documentNumber,
        @Size(max = 50) String correctedInvoiceNumber,
        @NotBlank @Size(max = 50) String documentDescription,
        @NotNull @Valid LocalDate receiptDate,
        @NotNull @Valid LocalDate saleDate,
        @NotNull @Valid LocalDate issueDate,
        @NotNull Boolean splitPayment,
        @NotNull Boolean isElectronicDocument,
        @NotNull @Valid CompanyInTableResource supplierCompanyInTableResource,
        @NotNull @Valid CompanyInTableResource recipientCompanyInTableResource,
        @NotNull @Valid PropertyResource propertyResource,
        @NotNull DocumentHistoryResource documentChangeHistory,
        @Valid PaymentInTableResource paymentInTableResource
) {
}
