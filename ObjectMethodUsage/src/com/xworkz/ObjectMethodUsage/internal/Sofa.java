package com.xworkz.ObjectMethodUsage.internal;

public class Sofa {
    private String material;
    private int seats;
    private String color;

    public Sofa(String material, int seats, String color) {
        System.out.println("String, int, String-arg const of Sofa");
        this.material = material;
        this.seats = seats;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sofa{" +
                "material='" + material + '\'' +
                ", seats=" + seats +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return 35345;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Sofa) {
                System.out.println("Ref instanceOf Sofa");
                Sofa sofa1 = this;
                Sofa  sofa2 = (Sofa) obj;
                if (sofa1.color == sofa2.color && sofa2.material == sofa1.material && sofa2.seats == sofa1.seats) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
