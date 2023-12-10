package com.edm.edmsystem.mapper;

import com.edm.edmsystem.dto.requests.UpdateDocumentRequest;
import com.edm.edmsystem.dto.resources.DocumentInTableResource;
import com.edm.edmsystem.dto.resources.DocumentResource;
import com.edm.edmsystem.model.Document;
import lombok.NonNull;

public interface DocumentMapper {
    DocumentInTableResource mapDocumentToDocumentInTableResource(@NonNull Document document);

    DocumentResource mapDocumentToDocumentResource(Document document);

    void updateDocumentFromUpdateDocumentRequest(Document document, UpdateDocumentRequest updateDocumentRequest);
}
