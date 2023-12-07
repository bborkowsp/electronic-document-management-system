package com.edm.edmsystem.mapper;

import com.edm.edmsystem.dto.requests.UpdateDocumentRequest;
import com.edm.edmsystem.dto.resources.DocumentInTableResource;
import com.edm.edmsystem.model.Document;
import lombok.NonNull;

public interface DocumentMapper {
    DocumentInTableResource mapDocumentToDocumentResource(@NonNull Document document);

    void updateDocumentFromUpdateDocumentRequest(Document document, UpdateDocumentRequest updateDocumentRequest);
}
