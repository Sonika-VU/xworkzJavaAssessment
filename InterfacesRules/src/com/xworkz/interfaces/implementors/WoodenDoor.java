package com.xworkz.interfaces.implementors;

import com.xworkz.interfaces.connectors.Door;

public class WoodenDoor  implements Door {
    @Override
    public void open() {
        System.out.println("Running open in WoodenDoor");
    }

    @Override
    public void close() {
        System.out.println("Running close in WoodenDoor");
    }



    @Override
    public void lock() {
        System.out.println("Running lock in WoodenDoor");
    }
}
