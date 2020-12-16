package com.hungrybook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hungrybook.model.Companies;

public interface CompanyRepository extends JpaRepository<Companies, Long>{

}
