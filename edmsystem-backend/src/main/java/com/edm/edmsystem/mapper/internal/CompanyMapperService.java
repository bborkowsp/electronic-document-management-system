package com.edm.edmsystem.mapper.internal;

import com.edm.edmsystem.dto.resources.CompanyInTableResource;
import com.edm.edmsystem.mapper.CompanyMapper;
import com.edm.edmsystem.model.Company;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
class CompanyMapperService implements CompanyMapper {
    @Override
    public Company mapCompanyResourceToCompany(CompanyInTableResource companyInTableResource) {
        return null;
    }

    @Override
    public CompanyInTableResource mapCompanyToCompanyInTableResource(Company company) {
        return CompanyInTableResource.builder()
                .name(company.getName())
                .build();
    }
}
