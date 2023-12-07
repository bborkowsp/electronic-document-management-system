package com.edm.edmsystem.controller;

import com.edm.edmsystem.dto.requests.UpdateDocumentRequest;
import com.edm.edmsystem.dto.resources.DocumentInTableResource;
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
    public ResponseEntity<Page<DocumentInTableResource>> getDocuments(Pageable pageable) {
        final var pageOfDocuments = documentUseCases.getDocuments(pageable);
        return ResponseEntity.ok(pageOfDocuments);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateDocument(@PathVariable Long id, @RequestBody @Valid UpdateDocumentRequest updateRecipeRequest) {
        documentUseCases.updateDocument(id, updateRecipeRequest);
        return ResponseEntity.noContent().build();
    }
}
