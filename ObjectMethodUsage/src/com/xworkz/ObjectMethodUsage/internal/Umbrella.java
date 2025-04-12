package com.xworkz.ObjectMethodUsage.internal;

public class Umbrella {
    private String size;
    private String color;
    private boolean isAutomatic;

    public Umbrella(String size, String color, boolean isAutomatic) {
        System.out.println("String, String, boolean-arg const of Umbrella");
        this.size = size;
        this.color = color;
        this.isAutomatic = isAutomatic;
    }

    @Override
    public String toString() {
        return "Umbrella{" +
                "size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", isAutomatic=" + isAutomatic +
                '}';
    }

    @Override
    public int hashCode() {
        return 40000;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Umbrella) {
                System.out.println("Ref instanceOf Umbrella");
                Umbrella umbrella1 = this;
                Umbrella  umbrella2 = (Umbrella) obj;
                if (umbrella2.isAutomatic == umbrella1.isAutomatic && umbrella2.color == umbrella1.color && umbrella2.size == umbrella1.size) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
