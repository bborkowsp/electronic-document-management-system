package com.edm.edmsystem.mapper.internal;

import com.edm.edmsystem.dto.resources.DocumentScanResource;
import com.edm.edmsystem.mapper.DocumentScanMapper;
import com.edm.edmsystem.model.DocumentScan;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DocumentScanMapperService implements DocumentScanMapper {
    @Override
    public DocumentScanResource mapDocumentScanToDocumentScanResource(DocumentScan scan) {
        String encodedPdf = java.util.Base64.getEncoder().encodeToString(scan.getPdfData());

        return DocumentScanResource.builder()
                .encodedPdf(encodedPdf)
                .build();
    }
}
