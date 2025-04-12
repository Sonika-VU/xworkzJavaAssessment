package com.xworkz.ObjectMethodUsage.internal;

public class Tattoo {
    private String design;
    private String location;
    private boolean isColored;

    public Tattoo(String design, String location, boolean isColored) {
        System.out.println("String, String, boolean-arg const of Tattoo");
        this.design = design;
        this.location = location;
        this.isColored = isColored;
    }

    @Override
    public String toString() {
        return "Tattoo{" +
                "design='" + design + '\'' +
                ", location='" + location + '\'' +
                ", isColored=" + isColored +
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
            if (obj instanceof Tattoo) {
                System.out.println("Ref instanceOf Tattoo");
                Tattoo tattoo1 = this;
                Tattoo  tattoo2 = (Tattoo) obj;
                if (tattoo2.isColored == tattoo1.isColored && tattoo2.design == tattoo1.design && tattoo2.location == tattoo1.location) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
