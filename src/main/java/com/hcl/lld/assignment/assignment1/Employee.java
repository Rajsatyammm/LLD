package com.hcl.lld.assignment.assignment1;

public abstract class Employee {
    private String name;
    private Integer age;
    private Double salary;
    private EmployeeType type;

    Employee(){}

    public Employee(String name, Integer age, Double salary, EmployeeType type) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public EmployeeType getType() {
        return type;
    }

    public void setType(EmployeeType type) {
        this.type = type;
    }
}