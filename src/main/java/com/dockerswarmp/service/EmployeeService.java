package com.dockerswarmp.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dockerswarmp.entity.Employee;
import com.dockerswarmp.repo.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repo;

    public Employee save(Employee emp) {
        return repo.save(emp);
    }

    public List<Employee> getAll() {
        return repo.findAll();
    }
}