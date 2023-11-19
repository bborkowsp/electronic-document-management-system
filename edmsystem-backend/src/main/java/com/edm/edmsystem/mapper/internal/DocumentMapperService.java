package com.edm.edmsystem.mapper.internal;

import com.edm.edmsystem.dto.resources.DocumentResource;
import com.edm.edmsystem.mapper.DocumentMapper;
import com.edm.edmsystem.model.Document;
import lombok.AccessLevel;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public class DocumentMapperService implements DocumentMapper {
    @Override
    public DocumentResource mapDocumentToDocumentResource(@NonNull Document document) {
        return DocumentResource.builder().
                documentNumber(document.getDocumentNumber())
                .build();
    }
}
