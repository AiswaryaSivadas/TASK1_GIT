package com.example.EmpMngmt.service;

import com.example.EmpMngmt.dto.Employee;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface EmployeeService {

    public Employee addEmployee(Employee employee);

    public Optional<Employee> getEmployee(int empId);

    public String deleteEmployee(Employee deletedUser);

    public String updateEmployee(Employee updateemployee);
}

