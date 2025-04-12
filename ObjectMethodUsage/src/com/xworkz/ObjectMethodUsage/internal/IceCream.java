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

    @Override
    public int hashCode() {
        return -23134;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof IceCream) {
                System.out.println("Ref instanceOf IceCream");
                IceCream iceCream1 = this;
                IceCream  iceCream2 = (IceCream) obj;
                if (iceCream1.flavor == iceCream2.flavor && iceCream1.hasNuts == iceCream2.hasNuts) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }

}
