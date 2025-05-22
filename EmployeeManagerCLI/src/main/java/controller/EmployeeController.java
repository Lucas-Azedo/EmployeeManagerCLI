package controller;

import model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.EmployeeService;

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
        return service.getEmployeById(id);
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable String id, @RequestBody Employeed updatedEmployee){
        return service.updateEmployee(id, updatedEmployee);
    }

    @DeleteMapping("{id}")
    public Employee deleteEmployee(@PathVariable String id){
        return service.deleteEmployee(id);
    }

}
