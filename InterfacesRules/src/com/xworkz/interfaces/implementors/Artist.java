package com.xworkz.interfaces.implementors;

import com.xworkz.interfaces.connectors.Rock;

public class Artist implements Rock {
    @Override
    public void breakIt() {

    }

    @Override
    public void makeIdol() {

    }

    @Override
    public void paint() {

    }

    @Override
    public void construct() {
        System.out.println("Running construct in Artist");
    }
}
