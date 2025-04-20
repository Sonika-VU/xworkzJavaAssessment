package com.xworkz.interfaces.implementors;

import com.xworkz.interfaces.connectors.Parlor;

public class Heroine implements Parlor {
    @Override
    public void hairCut() {

    }

    @Override
    public void massage() {

    }

    @Override
    public void pedicure() {

    }

    @Override
    public void makeUp() {
        System.out.println("Running makeUp in Heroine");
    }
}
