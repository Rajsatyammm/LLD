package com.hcl.lld.design_pattern.creational.factory;

import com.hcl.lld.design_pattern.creational.factory.vehicle.RoadVehicle;

public class Truck implements RoadVehicle {
    @Override
    public void deliver() {
        System.out.println("Delivering by Truck");
    }

    @Override
    public String deliverToAddress(String address) {
        System.out.println("Delivering by Truck to address :: " + address);
        return "";
    }
}
