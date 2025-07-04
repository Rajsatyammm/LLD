package com.hcl.lld.assignment.assignment1;

public class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String name, Integer age, Double salary) {
        super(name, age, salary, EmployeeType.FULL_TIME);
    }
}
