package com.hcl.lld.design_pattern.structural.decorator;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new SouceTopping(
            new CheeseTopping(
                new PaneerTopping(
                    new CheeseTopping(
                        new PizzaBase()
                    )
                )
            )
        );

        System.out.println(pizza.getPrice());
        System.out.println(pizza.getComposition());
    }
}
