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
		Company companyOne = new Company(1L, "VBurguer", "25469832541");
		Company companyTwo = new Company(2L, "ItalliRestorant", "433846213");

		return CompanyDto.convert(Arrays.asList(companyOne, companyTwo));
	}

}
