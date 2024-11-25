package com.example.springbootspark.model;

import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;
@Data
public class Employee {
    @Id
    private String employeeID;

    private String firstName;
    private String lastName;
    private int salary;
    private String department;
    private LocalDate hiringDate;
    private int salaryWithBonus;
    private String departmentUpperCase;
    private double experience;
}
