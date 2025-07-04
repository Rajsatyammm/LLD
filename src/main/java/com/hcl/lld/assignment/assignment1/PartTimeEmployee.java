package com.hcl.lld.assignment.assignment1;

public class PartTimeEmployee extends Employee {
    public PartTimeEmployee(String name, Integer age, Double salary) {
        super(name, age, salary, EmployeeType.PART_TIME);
    }
}
