package com.hcl.lld.design_pattern.structural.decorator;

public class CheeseTopping implements Pizza {
    private Pizza pizza;

    CheeseTopping(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 30;
    }

    @Override
    public String getComposition() {
        return pizza.getComposition() + " Cheese";
    }
}
