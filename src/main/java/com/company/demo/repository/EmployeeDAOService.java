package com.company.demo.repository;

import com.company.demo.model.Employee;

import java.util.List;

public interface EmployeeDAOService {

    Employee save(Employee employee);
    void delete(Long employeeId) throws Exception;
    Employee update(Long employeeId, Employee employeeDetails) throws Exception;
    Employee findById(Long employeeId) throws Exception;
    Employee findByFirstname(String firstName) throws Exception;
    List<Employee> findAll();
}
