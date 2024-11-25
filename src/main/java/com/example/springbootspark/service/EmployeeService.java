package com.example.springbootspark.service;

import com.example.springbootspark.model.Employee;

import java.util.List;

public interface EmployeeService {
    public void saveAll(List<Employee> employees);
}
