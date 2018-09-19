package com.lohith.principles.solid.liskov;

public class ElectricCar implements /*Vehicle*/ ElectricVehicle {
    @Override
    public void speed() {
        System.out.println(" Speed up the Electric car");
    }


    // Can not add fuel since it is electric car
 /*   @Override
    public void addFuel() {

    }*/

    @Override
    public void chargeBattery() {
        System.out.println(" Charging the Battery");
    }
}
