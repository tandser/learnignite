package ru.tandser.learnignite.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.tandser.learnignite.dto.Employee;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(EmployeeRestControllerImpl.ROOT_PATH)
public class EmployeeRestControllerImpl extends EmployeeController {

    private static final Logger logger = LoggerFactory.getLogger(EmployeeRestControllerImpl.class);

    static final String ROOT_PATH = "/rest/employee";

    @Override
    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public Employee getEmployee(@RequestParam String name) {
        logger.info("getEmployee: name = {}", name);
        return super.getEmployee(name);
    }
}