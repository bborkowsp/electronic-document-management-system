package com.edm.edmsystem.service;

import com.edm.edmsystem.dto.requests.UploadDocumentScanRequest;
import org.springframework.web.multipart.MultipartFile;


public interface DocumentScanUseCases {
    void createDocumentScan(UploadDocumentScanRequest uploadDocumentScanRequest);

    void processDocumentScan(MultipartFile[] file);
}
