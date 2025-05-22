package com.example.EmployeeManagerCLI.controller;

import com.example.EmployeeManagerCLI.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.EmployeeManagerCLI.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping
    public Employee CreateEmployee(@RequestBody Employee employee){
        return service.createEmployee(employee);
    }

    @GetMapping
    public List<Employee> getAllEmployees(){
        return service.getAllEmployees();
    }

    @GetMapping("/{id}")
     public Employee getEmployeeById(@PathVariable String id){
        return service.getEmployeeById(id);
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable String id, @RequestBody Employee updatedEmployee){
        return service.updateEmployee(id, updatedEmployee);
    }

    @DeleteMapping("{id}")
    public void deleteEmployee(@PathVariable String id){
        service.deleteEmployee(id);
    }

}
