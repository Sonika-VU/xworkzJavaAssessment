package com.xworkz.interfaces.connectors;

public interface Brick {
    void construct();
    void breakIt();
    void makeStrong();

    default void type(){
        System.out.println("Running type in Brick");
    }
}
