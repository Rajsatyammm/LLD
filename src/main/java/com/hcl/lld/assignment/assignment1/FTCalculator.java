package com.hcl.lld.assignment.assignment1;

public enum FTCalculator implements TaxCalculator {
    INSTANCE;

    @Override
    public Double calculateTax(Employee employee) {
        return 0.0;
    }
}
