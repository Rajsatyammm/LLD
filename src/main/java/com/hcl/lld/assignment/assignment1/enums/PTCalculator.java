package com.hcl.lld.assignment.assignment1.enums;

import com.hcl.lld.assignment.assignment1.factory.TaxCalculator;
import com.hcl.lld.assignment.assignment1.models.Employee;

public enum PTCalculator implements TaxCalculator {
    INSTANCE;
    @Override
    public Double calculateTax(Employee employee) {
        return 0.0;
    }
}
