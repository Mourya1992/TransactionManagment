package com.example.springTransactions.TransactionManagement.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="EMPLOYEE")

public class Employee {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private long id;
    private String name;
    private Date dateOfBirth;

    public Employee(String name, Date dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
