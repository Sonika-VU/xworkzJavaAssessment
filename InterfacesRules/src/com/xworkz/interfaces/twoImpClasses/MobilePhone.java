package com.xworkz.interfaces.twoImpClasses;

import com.xworkz.interfaces.connectors.GameController;
import com.xworkz.interfaces.connectors.LightControl;

public class MobilePhone implements GameController, LightControl {

    @Override
    public void startGame() {
        System.out.println("Running startGame in MobilePhone");
    }

    @Override
    public void pauseGame() {
        System.out.println("Running pauseGame in MobilePhone");
    }
    @Override
    public void resumeGame() {
        System.out.println("Running resumeGame in MobilePhone");
    }

    @Override
    public void turnOn() {
        System.out.println("Running turnOn in MobilePhone");
    }
    @Override
    public void turnOff() {
        System.out.println("Running turnOff in MobilePhone");
    }
    @Override
    public void dim() {
        System.out.println("Running dim in MobilePhone");
    }
}
