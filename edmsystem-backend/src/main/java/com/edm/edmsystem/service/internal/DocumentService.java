package com.edm.edmsystem.service.internal;

import com.edm.edmsystem.dto.requests.UpdateDocumentRequest;
import com.edm.edmsystem.dto.resources.DocumentResource;
import com.edm.edmsystem.mapper.DocumentMapper;
import com.edm.edmsystem.model.Document;
import com.edm.edmsystem.repository.DocumentRepository;
import com.edm.edmsystem.service.DocumentUseCases;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

@Service
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
class DocumentService implements DocumentUseCases {

    private final DocumentRepository documentRepository;

    private final DocumentMapper documentMapper;

    @Override
    @Transactional(readOnly = true)
    public Page<DocumentResource> getDocuments(Pageable pageable) {
        final var products = documentRepository.findAll(pageable);
        return products.map(documentMapper::mapDocumentToDocumentResource);
    }

    @Override
    @Transactional
    public void updateDocument(Long id, UpdateDocumentRequest updateDocumentRequest) {
        final var document = documentRepository.findById(id).orElseThrow();
        documentMapper.updateDocumentFromUpdateDocumentRequest(document, updateDocumentRequest);
        documentRepository.save(document);
    }

    public Document createDocumentFromPdf(Map<String, String> results) {
        return Document.builder()
                .documentNumber(results.get("documentNumber"))
                .build();
    }

}
