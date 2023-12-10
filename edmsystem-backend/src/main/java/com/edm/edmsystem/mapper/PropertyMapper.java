package com.edm.edmsystem.mapper;

import com.edm.edmsystem.dto.resources.PropertyResource;
import com.edm.edmsystem.model.Property;

import java.util.Set;

public interface PropertyMapper {
    Property mapPropertyResourceToProperty(PropertyResource propertyResource);

    PropertyResource mapPropertyToPropertyResource(Property property);

    Set<PropertyResource> mapPropertiesToPropertiesResource(Set<Property> properties);
}
