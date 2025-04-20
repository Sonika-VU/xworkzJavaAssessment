package com.xworkz.interfaces.connectors;

public interface Rock {
    void breakIt();
    void makeIdol();
    void paint();

    default  void construct(){
        System.out.println("Running construct in Rock");
    }
}
