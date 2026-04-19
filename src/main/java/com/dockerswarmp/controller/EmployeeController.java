package com.dockerswarmp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dockerswarmp.entity.Employee;
import com.dockerswarmp.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping
    public Employee save(@RequestBody Employee emp) {
        return service.save(emp);
    }

    @GetMapping
    public List<Employee> getAll() {
        return service.getAll();
    }
}