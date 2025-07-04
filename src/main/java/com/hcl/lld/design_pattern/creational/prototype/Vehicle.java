package com.hcl.lld.design_pattern.creational.prototype;

public class Vehicle implements Prototype {
    private Integer noOfWeels;
    private String vehicleName;

    public Vehicle(Integer wheel, String name) {
        noOfWeels = wheel;
        vehicleName = name;
    }

    @Override
    public Prototype clone() {
        return new Vehicle(this.noOfWeels, this.vehicleName);
    }

    public void ride() {
        System.out.println("Riding :: " + vehicleName + " with :: " + noOfWeels + " wheels");
    }
}
