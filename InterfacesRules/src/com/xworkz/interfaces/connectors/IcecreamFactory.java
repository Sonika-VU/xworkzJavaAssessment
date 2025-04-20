package com.xworkz.interfaces.connectors;

public interface IcecreamFactory {
    void setStandard();
    void addFlavor();
    void addColor();

    default void addTopings(){
        System.out.println("Running addToppings in IcecreamFactory");
    }
}
