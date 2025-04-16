package com.xworkz.interfaces.implementors;

import com.xworkz.interfaces.connectors.GateControl;

public class MainGate implements GateControl {
    @Override
    public void openGate() {
        System.out.println("Running openGate in MainGate");
    }

    @Override
    public void closeGate() {
        System.out.println("Running closeGate in MainGate");
    }

    @Override
    public void lockGate() {
        System.out.println("Running lockGate in MainGate");
    }
}
