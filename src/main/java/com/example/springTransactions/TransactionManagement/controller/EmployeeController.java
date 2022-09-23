package com.example.springTransactions.TransactionManagement.controller;

import com.example.springTransactions.TransactionManagement.Entity.Employee;
import com.example.springTransactions.TransactionManagement.Service.EmployeeJoiningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeJoiningService employeeJoiningService;

    @GetMapping("/test")
    public String testConnection() {
        return "Hello It's working";
    }
    @PostMapping("/createEMployee")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeJoiningService.createEmployee(employee);

    }
    @GetMapping("/findEmployee/{empId}")
    public Employee getEmployeeDtls(@PathVariable Long empId) {
        Employee emp = employeeJoiningService.getEmployeeDtls(empId).get();
        return emp;
    }
    @GetMapping("/findEmployeeByName/{empName}")
    public Employee getEmployeeDtls(@PathVariable String empName) {
        Employee emp = employeeJoiningService.findByName(empName).get();
        return emp;
    }
    @GetMapping("/findAllEmployees")
    public List<Employee> findAllEmployees() {

        return employeeJoiningService.getAllEmployeeDtls();
    }

    @DeleteMapping("/deleteEmployee/{empID}")
    public void deleteEmployee(@PathVariable long empID) {
        employeeJoiningService.deleteEmployee(empID);

    }

}
