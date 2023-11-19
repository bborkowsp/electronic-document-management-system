package com.edm.edmsystem.controller;

import com.edm.edmsystem.dto.resources.DocumentResource;
import com.edm.edmsystem.service.DocumentUseCases;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/edm/document")
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
class DocumentController {

    private final DocumentUseCases documentUseCases;

    @GetMapping
    public ResponseEntity<Page<DocumentResource>> getProducts(Pageable pageable) {
        return ResponseEntity.ok(documentUseCases.getDocuments(pageable));
    }
}
