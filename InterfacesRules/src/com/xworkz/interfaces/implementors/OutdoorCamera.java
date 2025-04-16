package com.xworkz.interfaces.implementors;

import com.xworkz.interfaces.connectors.Camera;

public class OutdoorCamera implements Camera {
    @Override
    public void capture() {
        System.out.println("Running startRecording in OutdoorCamera");
    }

    @Override
    public void record() {
        System.out.println("Running record in OutdoorCamera");
    }

    @Override
    public void zoom() {
        System.out.println("Running zoom in OutdoorCamera");
    }
}
