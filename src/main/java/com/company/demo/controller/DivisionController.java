package com.company.demo.controller;

import com.company.demo.model.Division;
import com.company.demo.repository.DivisionDAOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.Repository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api-div")
public class DivisionController {
    @Autowired
    DivisionDAOService divisionDAOService;

    @GetMapping("/divisions")
    public List<Division> getAllDivision() {
        return divisionDAOService.findAll();
    }

    @GetMapping("/divisions/{divisiname}")
    public ResponseEntity<Division> getDivisionByDivisionName(@PathVariable(value = "divisionname") String divisionName) throws Exception {
        Division division = divisionDAOService.findByDivisionName(divisionName);
        return ResponseEntity.ok().body(division);
    }
}
