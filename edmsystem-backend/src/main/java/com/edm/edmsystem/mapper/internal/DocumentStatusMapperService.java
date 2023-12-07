package com.edm.edmsystem.mapper.internal;

import com.edm.edmsystem.dto.resources.DocumentStatusResource;
import com.edm.edmsystem.mapper.DocumentStatusMapper;
import com.edm.edmsystem.model.DocumentStatus;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
class DocumentStatusMapperService implements DocumentStatusMapper {
    @Override
    public DocumentStatus mapDocumentStatusResourceToDocumentStatus(DocumentStatusResource documentStatusResource) {
        return null;
    }

    @Override
    public DocumentStatusResource mapDocumentStatusToDocumentStatusResource(DocumentStatus documentStatus) {
        return null;
    }
}
