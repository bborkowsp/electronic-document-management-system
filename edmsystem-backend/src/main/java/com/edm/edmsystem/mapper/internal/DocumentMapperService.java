package com.edm.edmsystem.mapper.internal;

import com.edm.edmsystem.dto.requests.UpdateDocumentRequest;
import com.edm.edmsystem.dto.resources.DocumentInTableResource;
import com.edm.edmsystem.dto.resources.DocumentResource;
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
    private final DocumentScanMapper documentScanMapper;

    @Override
    public DocumentResource mapDocumentToDocumentResource(@NonNull Document document) {
        return DocumentResource.builder()
                .id(document.getId())
                .documentType(document.getDocumentType())
                .documentNumber(document.getDocumentNumber())
                .correctedInvoiceNumber(document.getCorrectedInvoiceNumber())
                .documentDescription(document.getDocumentDescription())
                .receiptDate(document.getReceiptDate())
                .saleDate(document.getSaleDate())
                .issueDate(document.getIssueDate())
                .splitPayment(document.getSplitPayment())
                .isElectronicDocument(document.getIsElectronicDocument())
                .paymentResource(paymentMapper.mapPaymentToPaymentResource(document.getPayment()))
                .supplierCompanyResource(companyMapper.mapCompanyToCompanyResource(document.getSupplierCompany()))
                .recipientCompanyResource(companyMapper.mapCompanyToCompanyResource(document.getRecipientCompany()))
                .documentStatus(document.getDocumentStatus())
                .documentChangeHistory(document.getDocumentChangeHistory().get(document.getDocumentChangeHistory().size() - 1))
                .scanResource(documentScanMapper.mapDocumentScanToDocumentScanResource(document.getScan()))
                .build();
    }

    @Override
    public void updateDocumentFromUpdateDocumentRequest(Document document, UpdateDocumentRequest updateDocumentRequest) {

    }

    @Override
    public DocumentInTableResource mapDocumentToDocumentInTableResource(@NonNull Document document) {
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
