package com.edm.edmsystem.controller;

import com.edm.edmsystem.dto.requests.UploadDocumentScanRequest;
import com.edm.edmsystem.service.DocumentScanUseCases;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/upload")
@RequiredArgsConstructor
public class DocumentScanController {

    private final DocumentScanUseCases documentScanUseCases;

    @PostMapping
    public ResponseEntity<Void> uploadDocumentScan(@Valid UploadDocumentScanRequest uploadDocumentScanRequest) {
        documentScanUseCases.processDocumentScan(uploadDocumentScanRequest);
    }

}
