package com.xworkz.interfaces.connectors;

public interface Factory {

    void takePermission();
    void buyEquipments();
    void manufacture();

    default void sell(){

    }
}
