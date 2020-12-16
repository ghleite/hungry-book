package com.hungrybook.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hungrybook.dto.CompanyDto;
import com.hungrybook.model.Companies;
import com.hungrybook.repository.CompanyRepository;

@RestController
public class CompaniesController {
	
	@Autowired
	private CompanyRepository companyRepository;
	
	@RequestMapping("/companies")
	public List<CompanyDto> companiesList() {
		List<Companies> companies = companyRepository.findAll();
		return CompanyDto.convert(companies);
	}

}
