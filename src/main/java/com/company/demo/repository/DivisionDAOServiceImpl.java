package com.company.demo.repository;

import com.company.demo.model.Division;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;

public class DivisionDAOServiceImpl implements DivisionDAOService {

    @Autowired
    private DivisionRepository repository;

    @Override
    public List<Division> findAll() {
        return repository.findAll();
    }

    @Override
    public Division findByDivisionName(String divisionName) throws Exception {
        return repository.findByDivisionname(divisionName).orElseThrow(
                () -> new Exception("")
        );
    }

    @Override
    @Transactional
    public Division save(Division division) {
        return repository.save(division);
    }
}
