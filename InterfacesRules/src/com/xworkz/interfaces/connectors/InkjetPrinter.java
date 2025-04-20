package com.xworkz.interfaces.connectors;

public interface InkjetPrinter {
    void printPage();
    void cleanNozzle();
    void checkInkLevel();

    default void checkPaper(){
        System.out.println("Running checkPaper in InkjetPrinter");
    }
}
