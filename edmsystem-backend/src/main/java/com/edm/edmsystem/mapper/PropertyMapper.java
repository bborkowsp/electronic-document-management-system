package com.edm.edmsystem.mapper;

import com.edm.edmsystem.dto.resources.PropertyResource;
import com.edm.edmsystem.model.Property;

public interface PropertyMapper {
    Property mapPropertyResourceToProperty(PropertyResource propertyResource);
}
