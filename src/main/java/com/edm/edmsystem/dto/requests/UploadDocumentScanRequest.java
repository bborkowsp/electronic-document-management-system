package com.edm.edmsystem.dto.requests;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.web.multipart.MultipartFile;

public record UploadDocumentScanRequest(
        @NotNull @Valid MultipartFile documentScan
) {
}
