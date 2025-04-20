package com.xworkz.interfaces.implementors;

import com.xworkz.interfaces.connectors.GameController;

public class MobileGame implements GameController
{
    @Override
    public void startGame() {
        System.out.println("Running startGame in MobileGame");
    }

    @Override
    public void pauseGame() {
        System.out.println("Running pauseGame in MobileGame");
    }
    @Override
    public void resumeGame() {
        System.out.println("Running resumeGame in MobileGame");
    }

    @Override
    public void adjustTiming() {
        System.out.println("Running adjustTiming in MobileGame");

    }
}
