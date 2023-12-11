package com.edm.edmsystem.mapper;

import com.edm.edmsystem.dto.resources.DocumentScanResource;
import com.edm.edmsystem.model.DocumentScan;

public interface DocumentScanMapper {
    DocumentScanResource mapDocumentScanToDocumentScanResource(DocumentScan scan);
}
