package com.xworkz.ObjectMethodUsage.internal;

public class Helmet {
    private String type;
    private String color;
    private boolean isFullFace;

    public Helmet(String type, String color, boolean isFullFace) {
        System.out.println("String, String, boolean-arg const of Helmet");
        this.type = type;
        this.color = color;
        this.isFullFace = isFullFace;
    }

    @Override
    public String toString() {
        return "Helmet{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", isFullFace=" + isFullFace +
                '}';
    }

    @Override
    public int hashCode() {
        return -4536;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Helmet) {
                System.out.println("Ref instanceOf Helmet");
                Helmet helmet1 = this;
                Helmet  helmet2 = (Helmet) obj;
                if (helmet1.type == helmet2.type && helmet1.isFullFace == helmet2.isFullFace) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }

}
