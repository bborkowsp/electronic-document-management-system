package com.edm.edmsystem.service.internal;

import com.edm.edmsystem.model.Document;
import com.edm.edmsystem.repository.DocumentRepository;
import com.edm.edmsystem.service.DocumentUseCases;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public class DocumentService implements DocumentUseCases {
    private final DocumentRepository documentRepository;

    public List<Document> getDocuments() {
        return documentRepository.findAll();
    }

    public Document createDocumentFromPdf(Map<String, String> results) {
        return Document.builder()
                .documentNumber(results.get("documentNumber"))
                .build();
    }

}
