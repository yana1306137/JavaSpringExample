package com.company.demo.repository;

import com.company.demo.model.Division;

import java.util.List;

public interface DivisionDAOService {
    List<Division> findAll();
    Division findByDivisionName(String divisionName) throws Exception;
    Division save(Division division);
}
