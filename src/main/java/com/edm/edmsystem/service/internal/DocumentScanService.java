package com.edm.edmsystem.service.internal;

import com.edm.edmsystem.dto.requests.UploadDocumentScanRequest;
import com.edm.edmsystem.repository.DocumentScanRepository;
import com.edm.edmsystem.service.DocumentScanUseCases;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public class DocumentScanService implements DocumentScanUseCases {

    private final DocumentScanRepository documentScanRepository;

    @Override
    public void processDocumentScan(MultipartFile[] files) {
        for (MultipartFile file : files) {
            try {
                extractTextFromPDF(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void extractTextFromPDF(MultipartFile file) throws IOException {
        System.out.println(file.getBytes());
    }

    @Override
    public void createDocumentScan(UploadDocumentScanRequest uploadDocumentScanRequest) {

    }

}
