package com.xworkz.ObjectMethodUsage.internal;

public class Volcano {
    private String name;
    private String location;
    private boolean isActive;

    public Volcano(String name, String location, boolean isActive) {
        System.out.println("String, String, boolean-arg const of Volcano");
        this.name = name;
        this.location = location;
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "Volcano{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", isActive=" + isActive +
                '}';
    }

    @Override
    public int hashCode() {
        return 1000;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Volcano) {
                System.out.println("Ref instanceOf Volcano");
                Volcano volcano1 = this;
                Volcano  volcano2 = (Volcano) obj;
                if (volcano2.isActive == volcano1.isActive && volcano2.name == volcano1.name && volcano2.location ==volcano1.location) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
