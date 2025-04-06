package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Computer;
import com.xworkz.isARelation.Laptop;

public class ComputerRunner {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Computer computer1 = new Laptop();
        Laptop laptop = new Laptop();

        System.out.println("====================");
        computer.turnOn();
        computer.installSoftware();
        computer.connectToNetwork();
        computer.processData();
        computer.turnOff();

        System.out.println("====================");
        computer1.turnOn();
        computer1.installSoftware();
        computer1.connectToNetwork();
        computer1.processData();
        computer1.turnOff();

        System.out.println("====================");
        laptop.turnOn();
        laptop.installSoftware();
        laptop.connectToNetwork();
        laptop.processData();
        laptop.turnOff();
    }
}
