package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Car;
import com.xworkz.isARelation.Vehicle;

public class VehicleRunner {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Vehicle vehicle1 = new Car();
        Car car = new Car();

        System.out.println("=======================");
        vehicle.accelerate();
        vehicle.horn();
        vehicle.refuel();
        vehicle.start();
        vehicle.stop();

        System.out.println("=======================");
        vehicle1.accelerate();
        vehicle1.horn();
        vehicle1.refuel();
        vehicle1.start();
        vehicle1.stop();

        System.out.println("=======================");
        car.accelerate();
        car.horn();
        car.refuel();
        car.start();
        car.stop();

    }
}
