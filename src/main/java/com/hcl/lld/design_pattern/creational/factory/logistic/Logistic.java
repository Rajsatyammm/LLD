package com.hcl.lld.design_pattern.creational.factory.logistic;

import com.hcl.lld.design_pattern.creational.factory.vehicle.Vehicle;

public class Logistic {

    private Vehicle vehicle;

    protected Logistic(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void deliver() {
        vehicle.deliver();
    }

    public void deliverToAddress(String address) {
        vehicle.deliverToAddress(address);
    }
}
