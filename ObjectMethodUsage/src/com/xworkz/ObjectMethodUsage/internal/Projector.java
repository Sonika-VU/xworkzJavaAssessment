package com.xworkz.ObjectMethodUsage.internal;

public class Projector {
    private String company;
    private String color;
    private int price;

    public Projector(String company, String color, int price){
        System.out.println("String, String, int-arg const of Projector");
        this.company = company;
        this.color  = color;
        this. price =price;
    }

    @Override
    public String toString() {
        return "Projector{" +
                "company='" + company + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int hashCode() {
        return 573;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Projector) {
                System.out.println("Ref instanceOf Projector");
                Projector projector1 = this;
                Projector  projector2 = (Projector) obj;
                if (projector2.company == projector1.company && projector2.color == projector1.company && projector2.price == projector2.price) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
