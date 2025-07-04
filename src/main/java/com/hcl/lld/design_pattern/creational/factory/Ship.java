package com.hcl.lld.design_pattern.creational.factory;

import com.hcl.lld.design_pattern.creational.factory.vehicle.SeaVehicle;

public class Ship implements SeaVehicle {
    @Override
    public void deliver() {
        System.out.println("Delivering by ship");
    }

    @Override
    public String deliverToAddress(String address) {
        System.out.println("Delivering by Ship to address :: " + address);
        return "";
    }
}
