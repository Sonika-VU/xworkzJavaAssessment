package com.xworkz.interfaces.connectors;

public interface Dishwasher {
    void startWash();
    void stopWash();
    void dryDishes();

    default void adjustWaterFlow(){
        System.out.println("Running adjustWaterFlow in Dishwasher");
    }
}
