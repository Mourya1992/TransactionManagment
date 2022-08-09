package com.example.springTransactions.TransactionManagement.Service;

import com.example.springTransactions.TransactionManagement.Entity.Employee;
import com.example.springTransactions.TransactionManagement.Entity.EmployeeInsurance;
import com.example.springTransactions.TransactionManagement.Repository.EmployeeRepository;
import com.example.springTransactions.TransactionManagement.Repository.InsuranceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;

@Service

public class EmployeeJoiningService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private InsuranceRepository insuranceRepository;

    public Employee createEmployee(Employee employee) {
        Employee e = employeeRepository.save(employee);
        EmployeeInsurance empInsurance = new EmployeeInsurance("TATA Insurance", new Date(),employee.getId());
        insuranceRepository.save(empInsurance);
        return e;
    }

    public void deleteEmployee(long empId) {
        employeeRepository.deleteById(empId);
        insuranceRepository.deleteByEmpId(empId);
    }

}
