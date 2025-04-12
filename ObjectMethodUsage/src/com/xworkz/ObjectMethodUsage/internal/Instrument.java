package com.xworkz.ObjectMethodUsage.internal;

public class Instrument {
    private String name;
    private String type;
    private boolean electric;

    public Instrument(String name, String type, boolean electric) {
        System.out.println("String, String, boolean-arg const of Instrument");
        this.name = name;
        this.type = type;
        this.electric = electric;
    }

    @Override
    public String toString() {
        return "Instrument{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", electric=" + electric +
                '}';
    }

    @Override
    public int hashCode() {
        return -1;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Instrument) {
                System.out.println("Ref instanceOf Instrument");
                Instrument instrument1 = this;
                Instrument  instrument2 = (Instrument) obj;
                if (instrument1.name == instrument2.name && instrument1.type == instrument2.type) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }

}
