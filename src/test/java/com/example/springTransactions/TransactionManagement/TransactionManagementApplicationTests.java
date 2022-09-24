package com.example.springTransactions.TransactionManagement;

import com.example.springTransactions.TransactionManagement.Entity.Employee;
import com.example.springTransactions.TransactionManagement.Repository.EmployeeRepository;
import com.example.springTransactions.TransactionManagement.Service.EmployeeJoiningService;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class TransactionManagementApplicationTests {
    @InjectMocks
    private EmployeeJoiningService employeeJoiningServiceMock;
    @Mock
    private EmployeeRepository employeeRepositoryMock;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void contextLoads() {
    }

    @Test
    public void getEmployeeByIdTest() {
        when(employeeRepositoryMock.findByName("Raju")).thenReturn(Optional.of(new Employee(123, "Raju", new Date())));

        Employee emp = employeeJoiningServiceMock.findByName("Raju").get();

        Assertions.assertEquals("Raju", emp.getName());

    }
      @Test
    public void getAllEmployeesTest() {
        List<Employee> employeeList = new ArrayList<>();
        Employee e1 = new Employee(123, "ravi", new Date());
        Employee e2 = new Employee(124, "Anand", new Date());
        Employee e3 = new Employee(125, "Vajjala", new Date());
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);

        when(employeeRepositoryMock.findAll()).thenReturn(employeeList);

        List<Employee> emps = employeeJoiningServiceMock.getAllEmployeeDtls();

        Assertions.assertNotNull(emps);

    }

}
