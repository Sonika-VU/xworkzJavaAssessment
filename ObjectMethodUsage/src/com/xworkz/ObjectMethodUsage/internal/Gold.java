package com.xworkz.ObjectMethodUsage.internal;

public class Gold {
    private String ornamentType;
    private int weight;
    private double price;

    public Gold(String ornamentType, int weight, double price){
        System.out.println("String, int double-arg of Gold");
        this.ornamentType = ornamentType;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Gold{" +
                "ornamentType='" + ornamentType + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }

    @Override
    public int hashCode() {
        return 231250908;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Gold) {
                System.out.println("Ref instanceOf Gold");
                Gold gold1 = this;
                Gold  gold2 = (Gold) obj;
                if (gold1.ornamentType == gold2.ornamentType && gold1.weight == gold2.weight) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }

}
