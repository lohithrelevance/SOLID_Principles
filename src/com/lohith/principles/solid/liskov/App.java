package com.lohith.principles.solid.liskov;

public class App {

    public static void main(String[] args) {

     /*   Vehicle car = new ElectricCar();   After splitting Vehicle interface*/
        // car.addFuel(); // as per the logic Electric Car can not have fuel. we need to throw some exception

        // we can test like this
        /*if(car instanceof ElectricCar){
            System.out.println(" Fuel cannot be added to Electric Car");
        } else
            car.addFuel();*/
        /*
        Where ever we use ElectricCar in that place we should be use Vehicle as well , but due to add fuel
                in ElectricCar , Liskov Substitution Principle is violated.*/

        /*Interface Segregation Principle is there for rescue*/

        // need to split Vehicle Interface

        // after resolving the violation
/*
        Below ElectricVehicle and ElectricCar can be replaced without any issue , this is what Liskov Substitution
                principle

                Both derived type and Parent class type should be interchangeable .
                */

        ElectricVehicle car = new ElectricCar();
        car.chargeBattery();

        ElectricCar car1 = new ElectricCar();
        car1.chargeBattery();

    }
}
