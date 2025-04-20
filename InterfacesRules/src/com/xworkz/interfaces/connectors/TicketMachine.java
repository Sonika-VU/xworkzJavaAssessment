package com.xworkz.interfaces.connectors;

public interface TicketMachine {
    void issueTicket();
    void cancelTicket();
    void displayInfo();

    default void addPrice(){

    }
}

