package com.xworkz.interfaces.twoImpClasses;

import com.xworkz.interfaces.connectors.BarcodeScanner;
import com.xworkz.interfaces.connectors.GateControl;

public class ExitChecker implements BarcodeScanner, GateControl {
    @Override
    public void scanItem() {
        System.out.println("Running scanItem in ExitChecker");
    }

    @Override
    public void resetScanner() {
        System.out.println("Running resetScanner in ExitChecker");

    }

    @Override
    public void calibrate() {
        System.out.println("Running calibrate in ExitChecker");

    }

    @Override
    public void openGate() {
        System.out.println("Running openGate in ExitChecker");

    }

    @Override
    public void closeGate() {
        System.out.println("Running closeGate in ExitChecker");

    }

    @Override
    public void lockGate() {
        System.out.println("Running lockGate in ExitChecker");

    }
}
