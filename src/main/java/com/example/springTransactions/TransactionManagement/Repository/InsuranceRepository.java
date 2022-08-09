package com.example.springTransactions.TransactionManagement.Repository;

import com.example.springTransactions.TransactionManagement.Entity.EmployeeInsurance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InsuranceRepository extends JpaRepository<EmployeeInsurance,Long> {

    void deleteByEmpId(long empId);
}
