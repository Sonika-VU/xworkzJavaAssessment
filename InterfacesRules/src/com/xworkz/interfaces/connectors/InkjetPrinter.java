package com.xworkz.interfaces.connectors;

public interface InkjetPrinter {
    void printPage();
    void cleanNozzle();
    void checkInkLevel();
}
