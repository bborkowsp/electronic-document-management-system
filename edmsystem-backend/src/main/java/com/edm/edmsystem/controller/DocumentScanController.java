package com.edm.edmsystem.controller;

import com.edm.edmsystem.service.DocumentScanUseCases;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/edm/upload")
@RequiredArgsConstructor
class DocumentScanController {

    private final DocumentScanUseCases documentScanUseCases;

    @PostMapping
    public ResponseEntity<Void> uploadDocumentScan(@RequestParam("file") MultipartFile[] uploadedFiles) throws IOException {
        documentScanUseCases.uploadDocumentScan(uploadedFiles);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
