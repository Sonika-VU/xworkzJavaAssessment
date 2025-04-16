package com.xworkz.interfaces.implementors;

import com.xworkz.interfaces.connectors.TicketMachine;

public class MetroTicketMachine implements TicketMachine {
    @Override
    public void issueTicket() {
        System.out.println("Running issueTicket in MetroTicketMachine");
    }

    @Override
    public void cancelTicket() {
        System.out.println("Running cancelTicket in MetroTicketMachine");
    }

    @Override
    public void displayInfo() {
        System.out.println("Running displayInfo in MetroTicketMachine");
    }
}
