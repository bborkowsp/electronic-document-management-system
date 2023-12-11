package com.edm.edmsystem.dto.resources;

import lombok.Builder;
import lombok.extern.jackson.Jacksonized;

@Builder
@Jacksonized
public record DocumentScanResource(
        String encodedPdf
) {
}
