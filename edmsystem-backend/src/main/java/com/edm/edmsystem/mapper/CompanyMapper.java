package com.edm.edmsystem.mapper;

import com.edm.edmsystem.dto.resources.CompanyInTableResource;
import com.edm.edmsystem.model.Company;

public interface CompanyMapper {
    Company mapCompanyResourceToCompany(CompanyInTableResource companyInTableResource);

    CompanyInTableResource mapCompanyToCompanyInTableResource(Company company);
}
