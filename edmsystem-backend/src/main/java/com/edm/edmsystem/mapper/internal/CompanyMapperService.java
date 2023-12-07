package com.edm.edmsystem.mapper.internal;

import com.edm.edmsystem.dto.resources.CompanyResource;
import com.edm.edmsystem.mapper.CompanyMapper;
import com.edm.edmsystem.model.Company;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
class CompanyMapperService implements CompanyMapper {
    @Override
    public Company mapCompanyResourceToCompany(CompanyResource companyResource) {
        return null;
    }

    @Override
    public CompanyResource mapCompanyToCompanyResource(Company company) {
        return CompanyResource.builder()
                .name(company.getName())
                .build();
    }
}
