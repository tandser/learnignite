package ru.tandser.learnignite.dao;

import ru.tandser.learnignite.dto.Employee;

public interface EmployeeService {

    Employee getEmployee(String name);
}