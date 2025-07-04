package com.hcl.lld.design_pattern.creational.singleton;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = Vehicle.getInstance();
        vehicle.ride();
    }
}