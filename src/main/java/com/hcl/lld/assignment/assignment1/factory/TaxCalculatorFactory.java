package com.hcl.lld.assignment.assignment1.factory;

import com.hcl.lld.assignment.assignment1.enums.FTCalculator;
import com.hcl.lld.assignment.assignment1.enums.InternCalculator;
import com.hcl.lld.assignment.assignment1.enums.PTCalculator;
import com.hcl.lld.assignment.assignment1.models.Employee;

public class TaxCalculatorFactory {

    private TaxCalculatorFactory() {}

    public static TaxCalculator getTaxCalculator(Employee employee) {
        switch (employee.getType()) {
            case INTERN: return InternCalculator.INSTANCE;
            case PART_TIME: return PTCalculator.INSTANCE;
            case FULL_TIME: return FTCalculator.INSTANCE;
            default: return null;
        }
    }
}
