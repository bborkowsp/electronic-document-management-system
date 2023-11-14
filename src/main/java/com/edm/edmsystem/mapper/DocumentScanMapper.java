package com.edm.edmsystem.mapper;

import com.edm.edmsystem.dto.requests.UploadDocumentScanRequest;
import com.edm.edmsystem.model.DocumentScan;

public interface DocumentScanMapper {
    DocumentScan mapDocumentScnaRequestToDocumentScan(UploadDocumentScanRequest uploadDocumentScanRequest);
}
