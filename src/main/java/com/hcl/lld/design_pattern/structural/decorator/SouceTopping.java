package com.hcl.lld.design_pattern.structural.decorator;

public class SouceTopping implements Pizza {
    private Pizza pizza;

    SouceTopping(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 10;
    }

    @Override
    public String getComposition() {
        return pizza.getComposition() + " Souce";
    }
}
