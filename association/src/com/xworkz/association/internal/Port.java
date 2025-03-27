package com.xworkz.association.internal;

public class Port {
    private PortType portType;

    public Port(){
        System.out.println("no-arg const of Port");
    }

    public void connect(){
        System.out.println("Running connect in Port");
    }

    public void setPortType(PortType portType) {
        this.portType = portType;
    }

    public PortType getPortType() {
        return portType;
    }
}
