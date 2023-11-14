package com.edm.edmsystem.mapper.internal;

import com.edm.edmsystem.dto.requests.UploadDocumentScanRequest;
import com.edm.edmsystem.mapper.DocumentScanMapper;
import com.edm.edmsystem.model.DocumentScan;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DocumentScanMapperService implements DocumentScanMapper {
    @Override
    public DocumentScan mapDocumentScnaRequestToDocumentScan(UploadDocumentScanRequest uploadDocumentScanRequest) {
        return DocumentScan.builder().build();
    }
}
