package com.edm.edmsystem.mapper.internal;

import com.edm.edmsystem.dto.resources.PropertyResource;
import com.edm.edmsystem.mapper.PropertyMapper;
import com.edm.edmsystem.model.Property;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
class PropertyMapperService implements PropertyMapper {

    @Override
    public PropertyResource mapPropertyToPropertyResource(Property property) {
        return PropertyResource.builder()
                .propertyName(property.getName())
                .build();
    }

    @Override
    public Set<PropertyResource> mapPropertiesToPropertiesResource(Set<Property> properties) {
        return properties.stream()
                .map(this::mapPropertyToPropertyResource)
                .collect(Collectors.toSet());
    }

    @Override
    public Property mapPropertyResourceToProperty(PropertyResource propertyResource) {
        return null;
    }
}
