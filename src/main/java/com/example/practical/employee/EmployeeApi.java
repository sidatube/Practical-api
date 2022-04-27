package com.example.practical.employee;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "/api/v1/employees")
public class EmployeeApi {
    @Autowired
    EmployeeService employeeService;
    @GetMapping
    public ResponseEntity<List<Employee>> getEmployeeService() {
        return ResponseEntity.ok(employeeService.findAllEmployees());
    }
    @PostMapping
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
        return ResponseEntity.status(HttpStatus.CREATED).body(employeeService.createEmployee(employee));
    }

}
