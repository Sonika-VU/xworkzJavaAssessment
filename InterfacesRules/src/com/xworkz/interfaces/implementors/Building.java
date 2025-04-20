package com.xworkz.interfaces.implementors;

import com.xworkz.interfaces.connectors.Brick;

public class Building implements Brick {
    @Override
    public void construct() {
        System.out.println("Running construct in building");
    }

    @Override
    public void breakIt() {
        System.out.println("Running breakIt in building");
    }

    @Override
    public void makeStrong() {
        System.out.println("Running makeStrong in building");
    }

    @Override
    public void type() {
        System.out.println("Running type in building");
    }
}
