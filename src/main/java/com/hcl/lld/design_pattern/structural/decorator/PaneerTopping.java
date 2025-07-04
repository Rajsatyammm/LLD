package com.hcl.lld.design_pattern.structural.decorator;

public class PaneerTopping implements Pizza {
    private Pizza pizza;

    PaneerTopping(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 45;
    }

    @Override
    public String getComposition() {
        return pizza.getComposition() + " Paneer";
    }
}
