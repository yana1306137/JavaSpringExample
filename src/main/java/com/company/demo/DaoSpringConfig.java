package com.company.demo;

import com.company.demo.repository.DivisionDAOServiceImpl;
import com.company.demo.repository.EmployeeDAOService;
import com.company.demo.repository.EmployeeDAOServiceImpl;
import org.springframework.context.annotation.Bean;

public class DaoSpringConfig {
    @Bean
    public EmployeeDAOService employeeDAOService() {
        return new EmployeeDAOServiceImpl();
    }

    @Bean
    public DivisionDAOServiceImpl divisionDAOService() {
        return new DivisionDAOServiceImpl();
    }
}
