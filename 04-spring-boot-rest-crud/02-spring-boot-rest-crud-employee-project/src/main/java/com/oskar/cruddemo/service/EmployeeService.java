package com.oskar.cruddemo.service;

import com.oskar.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
}
