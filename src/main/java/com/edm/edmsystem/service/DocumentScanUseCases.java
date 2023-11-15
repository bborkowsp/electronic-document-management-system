package com.edm.edmsystem.service;

import org.springframework.web.multipart.MultipartFile;


public interface DocumentScanUseCases {

    void processDocumentScan(MultipartFile[] file);
}
