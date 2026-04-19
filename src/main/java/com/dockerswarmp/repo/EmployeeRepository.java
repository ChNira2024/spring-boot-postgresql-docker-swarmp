package com.dockerswarmp.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.dockerswarmp.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}