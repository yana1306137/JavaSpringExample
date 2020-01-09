package com.company.demo.repository;

import com.company.demo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;

public class EmployeeDAOServiceImpl implements EmployeeDAOService {
    @Autowired
    private  EmployeeRepository repository;

    @Override
    public List<Employee> findAll() {
        return repository.findAll();
    }


    @Override
    public Employee findById(Long employeeId) throws Exception {
        return repository.findById(employeeId)
                .orElseThrow(() -> new Exception("not found"));
    }

    @Override
    public Employee findByFirstname(String firstName) throws Exception {
        return repository.findByFirstname(firstName)
                .orElseThrow(() -> new Exception(""));
    }

    @Override
    @Transactional
    public Employee update(Long employeeId, Employee employeeDetails) throws Exception {
        Employee employee = findById(employeeId);
        employee.setEmail(employeeDetails.getEmail());
        employee.setLastname(employeeDetails.getLastname());
        employee.setFirstname(employeeDetails.getFirstname());
        employee.setDivision(employeeDetails.getDivision());
        return repository.save(employee);
    }

    @Override
    @Transactional
    public Employee save(Employee employee) {
        return repository.save(employee);
    }

    @Override
    public void delete(Long employeeId) throws Exception {
        Employee employee = findById(employeeId);
        repository.delete(employee);
    }

}
