package com.edm.edmsystem.mapper;

import com.edm.edmsystem.dto.resources.DocumentResource;
import com.edm.edmsystem.model.Document;
import lombok.NonNull;

public interface DocumentMapper {
    DocumentResource mapDocumentToDocumentResource(@NonNull Document document);
}
