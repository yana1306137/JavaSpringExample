package com.company.demo.repository;

import com.company.demo.model.Division;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DivisionRepository extends JpaRepository<Division, String> {
    Optional<Division> findByDivisionname(String divisionName);
}
