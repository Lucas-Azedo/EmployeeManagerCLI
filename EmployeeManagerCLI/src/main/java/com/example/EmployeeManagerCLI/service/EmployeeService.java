package com.example.EmployeeManagerCLI.service;

import com.example.EmployeeManagerCLI.model.Employee;
import com.example.EmployeeManagerCLI.repository.EmployeeDAO;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeeService {

    final private EmployeeDAO employeeDao;

    public EmployeeService(EmployeeDAO employeeDao){
        this.employeeDao = employeeDao;
    }

    public Employee createEmployee(Employee employee){
        return employeeDao.create(employee);
    }

    public List<Employee> getAllEmployees(){
        return employeeDao.findAll();
    }

    public Employee getEmployeeById(String id){
        return employeeDao.findById(id);
    }

    public Employee updateEmployee(String id, Employee updated){
       return employeeDao.update(id, updated);
    }
    public void deleteEmployee(String id){
        employeeDao.delete(id);
    }
}
