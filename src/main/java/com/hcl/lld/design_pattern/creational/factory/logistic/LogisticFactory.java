package com.hcl.lld.design_pattern.creational.factory.logistic;

import com.hcl.lld.design_pattern.creational.factory.Ship;
import com.hcl.lld.design_pattern.creational.factory.Truck;
import com.hcl.lld.design_pattern.creational.factory.vehicle.Vehicle;
import com.hcl.lld.design_pattern.creational.factory.enums.VehicleName;

public class LogisticFactory {
    public static Logistic getLogisticVehicle(VehicleName vehicleName) {
        Vehicle vehicle = switch (vehicleName) {
            case SHIP -> new Ship();
            case TRUCK -> new Truck();
            default -> throw new IllegalArgumentException("VehicleName is incorrect");
        };
        return new Logistic(vehicle);
    }
}
