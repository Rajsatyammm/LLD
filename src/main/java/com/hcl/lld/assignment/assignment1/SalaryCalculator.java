//package com.hcl.internalworking.assignment.assignment1;
//
//import com.hcl.internalworking.assignment.assignment1.tax.TaxStrategy;
//import com.hcl.internalworking.assignment.assignment1.tax.TaxStrategyFactory;
//import com.hcl.internalworking.assignment.assignment1.tax.Taxable;
//
//public class SalaryCalculator {
//    public Double calculateSalary(Employee employee) {
//        TaxStrategy taxStrategy = TaxStrategyFactory.getTaxStrategy(employee);
//        Double totalTax = 0.0;
//        for(Taxable tax : taxStrategy.getTaxList())
//            totalTax += tax.calculateTax(employee);
//        return employee.getSalary() - totalTax;
//    }
//}
