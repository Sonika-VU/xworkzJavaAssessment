package com.xworkz.interfaces.connectors;

public interface CoffeeMachine {
    void brew();
    void stop();
    void clean();

    default void start(){

    }
}
