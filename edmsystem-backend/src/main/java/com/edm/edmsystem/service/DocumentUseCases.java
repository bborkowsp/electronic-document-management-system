package com.edm.edmsystem.service;

import com.edm.edmsystem.dto.requests.UpdateDocumentRequest;
import com.edm.edmsystem.dto.resources.DocumentInTableResource;
import com.edm.edmsystem.dto.resources.DocumentResource;
import com.edm.edmsystem.model.Document;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Map;

public interface DocumentUseCases {
    Page<DocumentInTableResource> getDocuments(Pageable pageable);

    DocumentResource getDocument(Long id);

    Document createDocumentFromPdf(Map<String, String> results);

    void updateDocument(Long id, UpdateDocumentRequest updateDocumentRequest);

}
