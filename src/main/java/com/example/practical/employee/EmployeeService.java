package com.example.practical.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }
    public Employee createEmployee(Employee employee){
        return  employeeRepository.save(employee);
    }
}
