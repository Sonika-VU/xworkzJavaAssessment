package com.xworkz.interfaces.implementors;

import com.xworkz.interfaces.connectors.WindowController;

public class SmartWindow implements WindowController {
    @Override
    public void openWindow() {
        System.out.println("Running openWindow in SmartWindow");
    }

    @Override
    public void closeWindow() {
        System.out.println("Running closeWindow in SmartWindow");
    }

    @Override
    public void lockWindow() {
        System.out.println("Running lockWindow in SmartWindow");
    }
}
