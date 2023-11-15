package com.edm.edmsystem.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;


public interface DocumentScanUseCases {

    void processDocumentScan(MultipartFile[] uploadedFiles) throws IOException;
}
