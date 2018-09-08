package ru.tandser.learnignite.mapper;

import ru.tandser.learnignite.dto.Employee;

public interface EmployeeMapper {

    Employee getEmployee(String name);
}