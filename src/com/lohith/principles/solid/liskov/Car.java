package com.lohith.principles.solid.liskov;

public class Car implements /* Vehicle */ NormalVehicle{
    @Override
    public void speed() {
        System.out.println("Speed up the car...");
    }

    @Override
    public void addFuel() {
        System.out.println(" Adding fuel..");
    }
}
