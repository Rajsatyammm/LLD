package com.hcl.lld.assignment.assignment1;

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
