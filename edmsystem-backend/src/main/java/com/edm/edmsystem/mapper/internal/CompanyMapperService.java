package com.edm.edmsystem.mapper.internal;

import com.edm.edmsystem.dto.resources.CompanyInTableResource;
import com.edm.edmsystem.dto.resources.CompanyResource;
import com.edm.edmsystem.mapper.CompanyMapper;
import com.edm.edmsystem.mapper.PropertyMapper;
import com.edm.edmsystem.model.Company;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
class CompanyMapperService implements CompanyMapper {

    private final PropertyMapper propertyMapper;

    @Override
    public CompanyResource mapCompanyToCompanyResource(Company company) {
        return CompanyResource.builder()
                .name(company.getName())
                .propertiesResource(propertyMapper.mapPropertiesToPropertiesResource(company.getProperties()))
                .build();
    }

    @Override
    public Company mapCompanyInTableResourceToCompany(CompanyInTableResource companyInTableResource) {
        return null;
    }

    @Override
    public CompanyInTableResource mapCompanyToCompanyInTableResource(Company company) {
        return CompanyInTableResource.builder()
                .name(company.getName())
                .build();
    }
}
