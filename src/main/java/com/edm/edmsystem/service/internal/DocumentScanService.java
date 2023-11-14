package com.edm.edmsystem.service.internal;

import com.edm.edmsystem.dto.requests.UploadDocumentScanRequest;
import com.edm.edmsystem.mapper.DocumentScanMapper;
import com.edm.edmsystem.repository.DocumentScanRepository;
import com.edm.edmsystem.service.DocumentScanUseCases;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class DocumentScanService implements DocumentScanUseCases {

    private final DocumentScanRepository documentScanRepository;
    private final DocumentScanMapper documentScanMapper;

    @Override
    public void processDocumentScan(UploadDocumentScanRequest file) {
        MultipartFile pdfFile = UploadDocumentScanRequest.
    }

    @Override
    public void createDocumentScan(UploadDocumentScanRequest uploadDocumentScanRequest) {

    }
}
