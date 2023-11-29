package com.edm.edmsystem.mapper.internal;

import com.edm.edmsystem.dto.resources.PropertyResource;
import com.edm.edmsystem.mapper.PropertyMapper;
import com.edm.edmsystem.model.Property;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
class PropertyMapperService implements PropertyMapper {
    @Override
    public Property mapPropertyResourceToProperty(PropertyResource propertyResource) {
        return null;
    }
}
