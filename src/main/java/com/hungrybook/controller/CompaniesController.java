package com.hungrybook.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hungrybook.dto.CompanyDto;
import com.hungrybook.model.Company;

@RestController
public class CompaniesController {
	
	@RequestMapping("/companies")
	public List<CompanyDto> companiesList() {
		Company company = new Company(5418L, "VeganBurguer", "511569876");
		return CompanyDto.convert(Arrays.asList(company, company));
	}

}
