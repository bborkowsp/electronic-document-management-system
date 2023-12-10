package com.edm.edmsystem.dto.resources;

import lombok.Builder;
import lombok.extern.jackson.Jacksonized;

import java.util.Set;

@Builder
@Jacksonized
public record CompanyResource(
        String name,
        Set<PropertyResource> propertiesResource
) {
}
