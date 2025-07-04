package com.hcl.lld.design_pattern.creational.prototype;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(4, "Maruti");
        vehicle.ride();

        Vehicle v = (Vehicle) vehicle.clone();
        v.ride();
    }
}
