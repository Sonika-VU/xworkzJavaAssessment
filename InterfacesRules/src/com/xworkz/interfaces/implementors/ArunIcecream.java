package com.xworkz.interfaces.implementors;

import com.xworkz.interfaces.connectors.IcecreamFactory;

public class ArunIcecream implements IcecreamFactory {
    @Override
    public void setStandard() {

    }

    @Override
    public void addFlavor() {

    }

    @Override
    public void addColor() {

    }

    @Override
    public void addTopings() {
        System.out.println("Running addTopings in ArunIcecream");
    }
}
