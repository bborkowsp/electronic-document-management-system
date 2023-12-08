package com.edm.edmsystem.mapper.internal;

import com.edm.edmsystem.dto.requests.UpdateDocumentRequest;
import com.edm.edmsystem.dto.resources.DocumentInTableResource;
import com.edm.edmsystem.mapper.*;
import com.edm.edmsystem.model.Document;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
class DocumentMapperService implements DocumentMapper {

    private final CompanyMapper companyMapper;
    private final PaymentMapper paymentMapper;
    private final PropertyMapper propertyMapper;
    private final DocumentStatusMapper documentStatusMapper;
    private final DocumentHistoryMapper documentHistoryMapper;


    @Override
    public void updateDocumentFromUpdateDocumentRequest(Document document, UpdateDocumentRequest updateDocumentRequest) {
        final var recipentCompany = companyMapper.mapCompanyResourceToCompany(updateDocumentRequest
                .recipientCompanyInTableResource());
        final var supplierCompany = companyMapper.mapCompanyResourceToCompany(updateDocumentRequest
                .supplierCompanyInTableResource());
        final var payment = paymentMapper.mapPaymentResourceToPayment(updateDocumentRequest.paymentInTableResource());
        final var property = propertyMapper.mapPropertyResourceToProperty(updateDocumentRequest.propertyResource());
        final var documentStatus = documentStatusMapper.mapDocumentStatusResourceToDocumentStatus(updateDocumentRequest
                .documentStatusResource());
        final var documentHistory = updateDocumentRequest.documentChangeHistory().stream()
                .map(documentHistoryMapper::mapDocumentHistoryResourceToDocumentHistory)
                .toList();
        document.setRecipientCompany(recipentCompany);
        document.setSupplierCompany(supplierCompany);
        document.setPayment(payment);
        document.setProperty(property);
        document.setDocumentStatus(documentStatus);
        document.setDocumentChangeHistory(documentHistory);
        document.setDocumentType(updateDocumentRequest.documentTypeResource());
        document.setDocumentNumber(updateDocumentRequest.documentNumber());
        document.setCorrectedInvoiceNumber(updateDocumentRequest.correctedInvoiceNumber());
        document.setDocumentDescription(updateDocumentRequest.documentDescription());
        document.setReceiptDate(updateDocumentRequest.receiptDate());
        document.setSaleDate(updateDocumentRequest.saleDate());
        document.setIssueDate(updateDocumentRequest.issueDate());
        document.setSplitPayment(updateDocumentRequest.splitPayment());
        document.setIsElectronicDocument(updateDocumentRequest.isElectronicDocument());
    }

    @Override
    public DocumentInTableResource mapDocumentToDocumentResource(@NonNull Document document) {
        return DocumentInTableResource.builder().
                id(document.getId())
                .documentType(document.getDocumentType())
                .documentNumber(document.getDocumentNumber())
                .receiptDate(document.getReceiptDate())
                .saleDate(document.getSaleDate())
                .payment(paymentMapper.mapPaymentToPaymentInTableResource(document.getPayment()))
                .supplierCompany(companyMapper.mapCompanyToCompanyInTableResource(document.getSupplierCompany()))
                .recipientCompany(companyMapper.mapCompanyToCompanyInTableResource(document.getRecipientCompany()))
                .build();
    }
}
