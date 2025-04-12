package com.xworkz.ObjectMethodUsage.internal;


public class Poster {
    private  String size;
    private int cost;
    private boolean isColor;

    public Poster(String size, boolean isColor, int cost ){
        System.out.println("String, boolean, int const of Poster");
        this.size = size;
        this.isColor = isColor;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Poster{" +
                "size='" + size + '\'' +
                ", cost=" + cost +
                ", isColor=" + isColor +
                '}';
    }

    @Override
    public int hashCode() {
        return 436;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Poster) {
                System.out.println("Ref instanceOf Poster");
                Poster  poster1 = this;
                Poster  poster2 = (Poster) obj;
                if (poster1.size == poster2.size && poster1.cost == poster2.cost && poster1.isColor == poster2.isColor) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
