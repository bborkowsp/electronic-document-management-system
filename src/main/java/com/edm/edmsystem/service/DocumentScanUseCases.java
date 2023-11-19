package com.edm.edmsystem.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;


public interface DocumentScanUseCases {

    void uploadDocumentScan(MultipartFile[] uploadedFiles) throws IOException;
}
