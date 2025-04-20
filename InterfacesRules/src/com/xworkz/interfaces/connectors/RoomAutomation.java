package com.xworkz.interfaces.connectors;

public interface RoomAutomation {
    void openCurtains();
    void closeCurtains();
    void turnOnAC();

    default void light(){}
}
