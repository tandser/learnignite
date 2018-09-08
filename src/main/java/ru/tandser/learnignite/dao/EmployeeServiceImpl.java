package ru.tandser.learnignite.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.tandser.learnignite.dto.Employee;
import ru.tandser.learnignite.mapper.EmployeeMapper;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeMapper employeeMapper;

    @Override
    public Employee getEmployee(String name) {
        return employeeMapper.getEmployee(name);
    }

    /* Setters and Getters */

    @Autowired
    public void setEmployeeMapper(EmployeeMapper employeeMapper) {
        this.employeeMapper = employeeMapper;
    }
}