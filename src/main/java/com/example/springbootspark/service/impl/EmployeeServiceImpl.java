package com.example.springbootspark.service.impl;

import com.example.springbootspark.model.Employee;
import com.example.springbootspark.repository.EmployeeRepository;
import com.example.springbootspark.service.EmployeeService;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void saveAll(List<Employee> employees) {
        employeeRepository.saveAll(employees);
    }
}
