package com.hcl.lld.design_pattern.creational.factory;

import com.hcl.lld.design_pattern.creational.factory.enums.VehicleName;
import com.hcl.lld.design_pattern.creational.factory.logistic.Logistic;
import com.hcl.lld.design_pattern.creational.factory.logistic.LogisticFactory;

public class Main {
    public static void main(String[] args) {
        Logistic logistic = LogisticFactory.getLogisticVehicle(VehicleName.SHIP);
        logistic.deliver();

        Logistic logistic1 = LogisticFactory.getLogisticVehicle(VehicleName.TRUCK);
        logistic1.deliverToAddress("Gautambuddha Nagar");
    }
}
