package com.xworkz.interfaces.implementors;

import com.xworkz.interfaces.connectors.GameConsole;

public class PlayStation implements GameConsole {
    @Override
    public void startGame() {
        System.out.println("Running startGame in PlayStation");
    }

    @Override
    public void pauseGame() {
        System.out.println("Running pauseGame in PlayStation");
    }

    @Override
    public void quitGame() {
        System.out.println("Running quitGame in PlayStation");
    }
}
