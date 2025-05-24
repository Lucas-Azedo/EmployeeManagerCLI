package com.example.EmployeeManagerCLI.repository;

import com.example.EmployeeManagerCLI.model.Employee;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class EmployeeDAO {

    private final JdbcTemplate jdbcTemplate;

    public EmployeeDAO(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    private final RowMapper<Employee> rowMapper =(rs, rowNum) ->{
        Employee e = new Employee();
        e.setId(rs.getString("id"));
        e.setName(rs.getString("name"));
        e.setRole(rs.getString("role"));
        e.setHourlyPay(rs.getDouble("hourly_pay"));
        return e;
    };

    public Employee create(Employee employee){
        employee.setId(UUID.randomUUID().toString());
        jdbcTemplate.update("INSERT INTO employee (id, name, role, hourly_pay) values (?, ?, ?, ?)",
                employee.getId(), employee.getName(), employee.getRole(), employee.getHourlyPay());

        return employee;
    }

    public List<Employee> findAll(){
        return jdbcTemplate.query("SELECT * FROM employee", rowMapper);
    }

    public Employee findById(String id){
        List<Employee> results = jdbcTemplate.query("SELECT * FROM employee WHERE ID = ?", rowMapper, id);
        return results.isEmpty() ? null : results.getFirst();
    }

    public Employee update(String id, Employee updated){
        jdbcTemplate.update("UPDATE employee SET name = ? , role = ?, hourly_pay = ? WHERE id = ?",
                updated.getName(), updated.getRole(), updated.getHourlyPay(), id);
        return findById(id);
    }

    public void delete(String id){
        jdbcTemplate.update("DELETE FROM employee WHERE id = ?", id);
    }


}
