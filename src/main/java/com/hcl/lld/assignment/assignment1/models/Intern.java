package com.hcl.lld.assignment.assignment1.models;

import com.hcl.lld.assignment.assignment1.enums.EmployeeType;

public class Intern extends Employee {
    public Intern(String name, Integer age, Double salary) {
        super(name, age, salary, EmployeeType.INTERN);
    }
}
