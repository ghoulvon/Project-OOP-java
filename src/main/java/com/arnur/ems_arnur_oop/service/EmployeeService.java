package com.arnur.ems_arnur_oop.service;

import com.arnur.ems_arnur_oop.api.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    private List<Employee> employees = new ArrayList<>();

    public Employee addEmployee(Employee employee) {
        employees.add(employee);
        return employee;
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }

    public void deleteEmployee(Long id) {
        employees.removeIf(employee -> employee.getId().equals(id));
    }
    public Employee getEmployeeById(Long id) {
        Optional<Employee> employeeOptional = emsRepository.findById(id);
        return employeeOptional.orElseThrow(() -> new IllegalArgumentException("Employee with id " + id + " not found"));
    }
}
