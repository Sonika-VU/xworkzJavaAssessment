package com.xworkz.interfaces.implementors;

import com.xworkz.interfaces.connectors.InkjetPrinter;

public class CanonPrinter implements InkjetPrinter {
    @Override
    public void printPage() {
        System.out.println("Running printPage in CanonPrinter");
    }

    @Override
    public void cleanNozzle() {
        System.out.println("Running cleanNozzle in CanonPrinter");
    }

    @Override
    public void checkInkLevel() {
        System.out.println("Running checkInkLevel in CanonPrinter");
    }
}
