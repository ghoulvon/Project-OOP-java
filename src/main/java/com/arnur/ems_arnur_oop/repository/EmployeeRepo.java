package com.arnur.ems_arnur_oop.repository;

import com.arnur.ems_arnur_oop.api.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}
