package com.xworkz.interfaces.connectors;

public interface Robot {
    void walk();
    void talk();
    void recharge();

    default void makeTask(){
        System.out.println("Running makeTask in Robot");
    }
}
