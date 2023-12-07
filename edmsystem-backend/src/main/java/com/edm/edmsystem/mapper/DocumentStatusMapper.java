package com.edm.edmsystem.mapper;

import com.edm.edmsystem.dto.resources.DocumentStatusResource;
import com.edm.edmsystem.model.DocumentStatus;

public interface DocumentStatusMapper {
    DocumentStatus mapDocumentStatusResourceToDocumentStatus(DocumentStatusResource documentStatusResource);

    DocumentStatusResource mapDocumentStatusToDocumentStatusResource(DocumentStatus documentStatus);
}
