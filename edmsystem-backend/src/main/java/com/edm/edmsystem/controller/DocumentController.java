package com.edm.edmsystem.controller;

import com.edm.edmsystem.dto.requests.UpdateDocumentRequest;
import com.edm.edmsystem.dto.resources.DocumentInTableResource;
import com.edm.edmsystem.dto.resources.DocumentResource;
import com.edm.edmsystem.service.DocumentUseCases;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/edm/document")
@RequiredArgsConstructor
class DocumentController {

    private final DocumentUseCases documentUseCases;

    @GetMapping
    public ResponseEntity<Page<DocumentInTableResource>> getDocumentsInTable(Pageable pageable) {
        final var pageOfDocuments = documentUseCases.getDocumentsInTable(pageable);
        return ResponseEntity.ok(pageOfDocuments);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DocumentResource> getDocument(@PathVariable Long id) {
        final var document = documentUseCases.getDocument(id);
        return ResponseEntity.ok(document);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateDocument(@PathVariable Long id, @RequestBody @Valid UpdateDocumentRequest updateRecipeRequest) {
        documentUseCases.updateDocument(id, updateRecipeRequest);
        return ResponseEntity.noContent().build();
    }
}
