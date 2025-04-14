package com.xworkz.ObjectMethodUsage.internal;

public class TShirtRunner {
    public static void main(String[] args) {
        TShirt tShirt1 = new TShirt("xworkz", "s", "black", 0);
        TShirt tShirt2 = new TShirt("xworkz", "xs", "black", 0);

        boolean same = tShirt1.equals(tShirt2);
        System.out.println(same);
    }
}
