package com.example.EmployeeManagerCLI.service;

import com.example.EmployeeManagerCLI.model.Employee;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeeService {

    private Map<String, Employee> employeeMap = new HashMap<>();

    public Employee createEmployee(Employee employee){
        String id = UUID.randomUUID().toString();

        employee.setId(id);
        employeeMap.put(id, employee);

        return employee;
    }

    public List<Employee> getAllEmployees(){
        return new ArrayList<>(employeeMap.values());
    }

    public Employee getEmployeeById(String id){
        return employeeMap.get(id);
    }

    public Employee updateEmployee(String id, Employee updatedEmployee){
        Employee existingEmployee = employeeMap.get(id);

        if (existingEmployee == null){
            return null;
        }

        existingEmployee.setName(updatedEmployee.getName());
        existingEmployee.setHourlyPay(updatedEmployee.getHourlyPay());
        existingEmployee.setRole(updatedEmployee.getRole());

        employeeMap.put(id, existingEmployee);
        return existingEmployee;
    }
    public void deleteEmployee(String id){
        employeeMap.remove(id);
    }
}
