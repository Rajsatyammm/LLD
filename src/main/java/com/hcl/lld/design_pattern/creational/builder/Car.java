package com.hcl.lld.design_pattern.creational.builder;

public class Car {
    private Integer carId;
    private String carName;
    private String brand;

    public Integer getCarId() {
        return this.carId;
    }

    public String getCarName() {
        return this.carName;
    }

    public String getBrand() {
        return this.brand;
    }

    static class CarBuilder {
        private Car car;

        private CarBuilder() {
            car = new Car();
        }

        public CarBuilder setCarId(Integer id) {
            car.carId = id;
            return this;
        }

        public CarBuilder setCarName(String name) {
            car.carName = name;
            return this;
        }

        public CarBuilder setBrand(String brand) {
            car.brand = brand;
            return this;
        }

        public Car build() {
            return car;
        }
    }

    public static CarBuilder builder() {
        return new CarBuilder();
    }

    @Override
    public String toString() {
        return "Car{" +
            "carId=" + carId +
            ", carName='" + carName + '\'' +
            ", brand='" + brand + '\'' +
            '}';
    }
}
