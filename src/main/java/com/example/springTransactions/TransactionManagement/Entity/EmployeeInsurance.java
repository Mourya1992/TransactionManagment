package com.example.springTransactions.TransactionManagement.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Employee_Insurance")
public class EmployeeInsurance {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String insurerName;
    private Date startDate;

    private long empId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public String getInsurerName() {
        return insurerName;
    }

    public void setInsurerName(String insurerName) {
        this.insurerName = insurerName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public EmployeeInsurance(String insurerName, Date startDate,long empId) {
        this.insurerName = insurerName;
        this.startDate = startDate;
        this.empId=empId;
    }
}
