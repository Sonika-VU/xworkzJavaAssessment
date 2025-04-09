package com.xworkz.ObjectMethodUsage.internal;

public class IceCream {
    private String flavor;
    private int calories;
    private boolean hasNuts;

    public IceCream(String flavor, int calories, boolean hasNuts) {
        System.out.println("String, int, boolean-arg const of IceCream");
        this.flavor = flavor;
        this.calories = calories;
        this.hasNuts = hasNuts;
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "flavor='" + flavor + '\'' +
                ", calories=" + calories +
                ", hasNuts=" + hasNuts +
                '}';
    }
}
