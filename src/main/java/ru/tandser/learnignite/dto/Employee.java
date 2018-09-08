package ru.tandser.learnignite.dto;

import com.google.common.base.MoreObjects;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Employee implements Serializable {

    private static final long serialVersionUID = -6341415446850034745L;

    private Integer id;
    private String  name;
    private String  job;
    private Integer manager;
    private Date    hired;
    private Integer salary;
    private Integer department;

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id",         id)
                .add("name",       name)
                .add("job",        job)
                .add("manager",    manager)
                .add("hired",      hired)
                .add("salary",     salary)
                .add("department", department)
                .toString();
    }

    /* Setters and Getters */

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Integer getManager() {
        return manager;
    }

    public void setManager(Integer manager) {
        this.manager = manager;
    }

    public Date getHired() {
        return hired;
    }

    public void setHired(Date hired) {
        this.hired = hired;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getDepartment() {
        return department;
    }

    public void setDepartment(Integer department) {
        this.department = department;
    }
}