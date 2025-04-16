package com.xworkz.interfaces.implementors;

import com.xworkz.interfaces.connectors.SmartFridge;

public class SamsungFridge implements SmartFridge {
    @Override
    public void cool() {
        System.out.println("Running cool in SamsungFridge");
    }

    @Override
    public void defrost() {
        System.out.println("Running defrost in SamsungFridge");
    }

    @Override
    public void displayTemp() {
        System.out.println("Running displayTemp in SamsungFridge");
    }
}
