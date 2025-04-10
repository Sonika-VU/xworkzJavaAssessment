package com.xworkz.ObjectMethodUsage.internal;

public class CurrencyNote {
    private int value;
    private String country;
    private boolean inCirculation;

    public CurrencyNote(int value, String country, boolean inCirculation) {
        System.out.println("int, String, boolean-arg const of CurrencyNote");
        this.value = value;
        this.country = country;
        this.inCirculation = inCirculation;
    }

    @Override
    public String toString() {
        return "CurrencyNote{" +
                "value=" + value +
                ", country='" + country + '\'' +
                ", inCirculation=" + inCirculation +
                '}';
    }

    @Override
    public int hashCode() {
        return 1000;
    }
}
