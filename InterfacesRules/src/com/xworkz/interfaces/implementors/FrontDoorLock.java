package com.xworkz.interfaces.implementors;

import com.xworkz.interfaces.connectors.SmartLock;

public class FrontDoorLock implements SmartLock {
    @Override
    public void lock() {
        System.out.println("Running lock in FrontDoorLock");
    }

    @Override
    public void unlock() {
        System.out.println("Running unlock in FrontDoorLock");
    }

    @Override
    public void checkStatus() {
        System.out.println("Running checkStatus in FrontDoorLock");
    }

    @Override
    public void fix() {
        System.out.println("Running fix in FrontDoorLock");
    }
}
