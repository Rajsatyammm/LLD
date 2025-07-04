package com.hcl.lld.design_pattern.creational.singleton;

public class Vehicle {
    private static Vehicle vehicle;

    private Vehicle() {
    }

    public static Vehicle getInstance() {
        if(vehicle == null) {
            synchronized (Vehicle.class) {
                if (vehicle == null)
                    vehicle = new Vehicle();
            }
        }
        return vehicle;
    }

    public void ride() {
        System.out.println("Riding Vehicle");
    }
}
