package com.edm.edmsystem.mapper;

import com.edm.edmsystem.dto.resources.CompanyResource;
import com.edm.edmsystem.model.Company;

public interface CompanyMapper {
    Company mapCompanyResourceToCompany(CompanyResource companyResource);

    CompanyResource mapCompanyToCompanyResource(Company company);
}
