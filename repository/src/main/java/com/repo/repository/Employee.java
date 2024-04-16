package com.repo.repository;

import org.springframework.stereotype.Component;

@Component
public class Employee {
    ServiceEmp serviceEmp;
    public Employee(ServiceEmp serviceEmp)
    {
        this.serviceEmp = serviceEmp;    
    }

    public String display()
    {
        return serviceEmp.display();
    }
}
