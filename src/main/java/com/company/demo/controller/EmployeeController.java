package com.company.demo.controller;

import com.company.demo.model.Employee;
import com.company.demo.repository.EmployeeDAOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private EmployeeDAOService employeeDAOService;

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeeDAOService.findAll();
    }

    @GetMapping("/employees/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable(value =  "id") Long employeeId) throws Exception {
        Employee employee = employeeDAOService.findById(employeeId);
        return ResponseEntity.ok().body(employee);
    }

    @GetMapping("employee/{firstname}")
    public ResponseEntity<Employee> getEmployeeByName(@PathVariable(value = "firstname") String firstName) throws Exception {
        Employee employee = employeeDAOService.findByFirstname(firstName);
        return ResponseEntity.ok().body(employee);
    }

    @PostMapping("employees")
    public Employee createEmployee(@Valid @RequestBody Employee employee) {
        return employeeDAOService.save(employee);
    }

    @PutMapping("employees/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable(value = "id") Long employeeId,
                                                   @Valid @RequestBody Employee employeeDetails) throws Exception {
        Employee updatedEmployee = employeeDAOService.update(employeeId, employeeDetails);
        return ResponseEntity.ok(updatedEmployee);
    }

    @DeleteMapping("/employee/{id}")
    public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Long employeeId) throws Exception {
        employeeDAOService.delete(employeeId);
        Map<String, Boolean> response =  new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}
