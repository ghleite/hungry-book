package com.hungrybook.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.hungrybook.model.Companies;

public class CompanyDto {

	private String name;
	
	public CompanyDto(Companies company) {
		this.name = company.getName();
	}	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static List<CompanyDto> convert(List<Companies> companies) {
		return companies.stream().map(CompanyDto::new).collect(Collectors.toList());
	}
}
