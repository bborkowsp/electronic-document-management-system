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

@RestController
@RequestMapping("/upload")
@RequiredArgsConstructor
public class DocumentScanController {

    private final DocumentScanUseCases documentScanUseCases;

    @PostMapping
    public ResponseEntity<Void> uploadDocumentScan(@RequestParam("file") MultipartFile[] files) {
        documentScanUseCases.processDocumentScan(files);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
