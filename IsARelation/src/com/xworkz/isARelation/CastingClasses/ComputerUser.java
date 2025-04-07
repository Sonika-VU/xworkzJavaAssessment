package com.xworkz.isARelation.CastingClasses;

import com.xworkz.isARelation.Computer;
import com.xworkz.isARelation.Laptop;

public class ComputerUser {
    public void useComputer(Computer computer){
        computer.turnOn();
        computer.installSoftware();
        computer.connectToNetwork();
        computer.processData();
        computer.turnOff();

        if(computer instanceof  Laptop){
            Laptop laptop = (Laptop) computer;
            laptop.editExcel();
        }
    }
}
