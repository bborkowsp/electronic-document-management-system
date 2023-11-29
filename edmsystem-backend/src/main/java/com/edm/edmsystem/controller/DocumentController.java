package com.edm.edmsystem.controller;

import com.edm.edmsystem.dto.requests.UpdateDocumentRequest;
import com.edm.edmsystem.dto.resources.DocumentResource;
import com.edm.edmsystem.service.DocumentUseCases;
import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/edm/document")
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
class DocumentController {

    private final DocumentUseCases documentUseCases;

    @GetMapping
    public ResponseEntity<Page<DocumentResource>> getDocuments(Pageable pageable) {
        return ResponseEntity.ok(documentUseCases.getDocuments(pageable));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateDocument(@PathVariable Long id, @RequestBody @Valid UpdateDocumentRequest updateRecipeRequest) {
        documentUseCases.updateDocument(id, updateRecipeRequest);
        return ResponseEntity.noContent().build();
    }
}
