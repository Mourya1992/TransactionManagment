package com.example.springTransactions.TransactionManagement.Repository;

import com.example.springTransactions.TransactionManagement.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    }
