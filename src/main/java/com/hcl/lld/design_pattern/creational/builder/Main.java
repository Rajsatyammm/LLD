package com.hcl.lld.design_pattern.creational.builder;


public class Main {
    public static void main(String[] args) {
        Car car = Car.builder()
            .setCarId(2)
            .setCarName("Nexon")
            .setBrand("TATA")
            .build();
        System.out.println(car);
    }
}
