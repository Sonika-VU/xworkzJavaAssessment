package com.xworkz.interfaces.connectors;

public interface RobotVacuum {
    void startCleaning();
    void returnToDock();
    void emptyDustbin();
    default void sweep(){
        System.out.println("Running sweep in RobotVacuum");
    }
}
