package com.arnur.ems_arnur_oop.api.model;
import com.arnur.ems_arnur_oop.api.model.Employee;
import com.arnur.ems_arnur_oop.api.model.Manager;
import com.arnur.ems_arnur_oop.api.model.Intern;
import com.arnur.ems_arnur_oop.api.model.EmployeeFactory;



public class Main {
    public static void main(String[] args) {
        Employee manager = EmployeeFactory.createEmployee("Manager", 2L, "Nuray", "Manager", 250000, "IT");
        Employee intern = EmployeeFactory.createEmployee("Intern", 3L, "Arnur", "Intern", 150000, "NU");
        Employee employee = EmployeeFactory.createEmployee("Employee", 1L, "Ardak", "Developer", 200000, null);
        manager.work();
        intern.work();
        employee.work();
    }
}
