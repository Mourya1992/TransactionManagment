package com.example.springTransactions.TransactionManagement.controller;

import com.example.springTransactions.TransactionManagement.Entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class EmployeeController {
    @GetMapping("/test")
    public String testConnection() {
        return "Hello It's working";
    }

    @PostMapping("/createEMployee")
    public Employee createEmployee() {
        return new Employee("Arun", new Date());

    }
}
