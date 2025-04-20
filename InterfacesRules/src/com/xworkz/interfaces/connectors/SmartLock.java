package com.xworkz.interfaces.connectors;

public interface SmartLock {
    void lock();
    void unlock();
    void checkStatus();

    default void fix(){

    }
}
