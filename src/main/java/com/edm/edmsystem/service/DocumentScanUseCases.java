package com.edm.edmsystem.service;

import com.edm.edmsystem.dto.requests.UploadDocumentScanRequest;


public interface DocumentScanUseCases {
    void createDocumentScan(UploadDocumentScanRequest uploadDocumentScanRequest);

    void processDocumentScan(UploadDocumentScanRequest file);
}
