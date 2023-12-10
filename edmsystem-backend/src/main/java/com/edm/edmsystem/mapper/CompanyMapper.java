package com.edm.edmsystem.mapper;

import com.edm.edmsystem.dto.resources.CompanyInTableResource;
import com.edm.edmsystem.dto.resources.CompanyResource;
import com.edm.edmsystem.model.Company;

public interface CompanyMapper {

    CompanyResource mapCompanyToCompanyResource(Company company);

    Company mapCompanyInTableResourceToCompany(CompanyInTableResource companyInTableResource);

    CompanyInTableResource mapCompanyToCompanyInTableResource(Company company);
}
