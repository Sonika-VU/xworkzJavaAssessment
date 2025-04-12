package com.xworkz.ObjectMethodUsage.internal;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class Laptop {
    private String brand;
    private int storage;
    private String processor;

    public Laptop(String brand, int storage, String processor){
        System.out.println("String, int, String-arg const of Laptop");
        this.brand= brand;
        this.storage = storage;
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", storage=" + storage +
                ", processor='" + processor + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return 3928401;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Laptop) {
                System.out.println("Ref instanceOf Laptop");
                Laptop laptop1 = this;
                Laptop  laptop2 = (Laptop) obj;
                if (laptop1.storage == laptop2.storage && laptop1.processor == laptop2.processor) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
