package com.hcl.lld.design_pattern.structural.decorator;

public class PizzaBase implements Pizza{
    @Override
    public int getPrice() {
        return 50;
    }

    @Override
    public String getComposition() {
        return "Pizza-Base";
    }
}
