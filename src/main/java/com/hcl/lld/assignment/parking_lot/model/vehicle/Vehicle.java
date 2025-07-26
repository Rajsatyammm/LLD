package com.hcl.lld.assignment.parking_lot.model.vehicle;

public abstract class Vehicle {
    private final VehicleType vehicleType;

    public Vehicle(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
