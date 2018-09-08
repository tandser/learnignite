package ru.tandser.learnignite.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import ru.tandser.learnignite.dao.EmployeeService;
import ru.tandser.learnignite.dto.Employee;

public abstract class EmployeeController {

    private EmployeeService employeeService;

    public Employee getEmployee(String name) {
        return employeeService.getEmployee(name);
    }

    /* Setters and Getters */

    @Autowired
    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
}