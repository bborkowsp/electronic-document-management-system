package com.edm.edmsystem.mapper;

import com.edm.edmsystem.dto.resources.DocumentHistoryResource;
import com.edm.edmsystem.model.DocumentHistory;

public interface DocumentHistoryMapper {
    DocumentHistory mapDocumentHistoryResourceToDocumentHistory(DocumentHistoryResource documentHistoryResource);
}
