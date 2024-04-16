package com.repo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController
{
    @Autowired
    Employee employee;

    @GetMapping("/")
    public String getEmployee() {
        return employee.display(); 
    }
    
}