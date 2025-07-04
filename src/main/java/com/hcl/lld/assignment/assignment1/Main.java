package com.hcl.lld.assignment.assignment1;

public class Main {
    public static void main(String[] args) {
        Employee emp = new FullTimeEmployee("Raju", 30, 30000.3);
        Employee intern = new Intern("Intern", 30, 30000.3);
        Employee emp1 = new PartTimeEmployee("Raju", 30, 30000.3);
        Double taxCalculatorFactory = TaxCalculatorFactory.getTaxCalculator(emp).calculateTax(emp);
    }
}
