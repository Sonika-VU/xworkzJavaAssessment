package com.xworkz.ObjectMethodUsage.internal;

public class Subscription {
    private String userName;
    private String planType;
    private int validityDays;

    public Subscription(String userName, String planType, int validityDays) {
        System.out.println("String, String, int-arg const of Subscription");
        this.userName = userName;
        this.planType = planType;
        this.validityDays = validityDays;
    }

    @Override
    public String toString() {
        return "Subscription{" +
                "userName='" + userName + '\'' +
                ", planType='" + planType + '\'' +
                ", validityDays=" + validityDays +
                '}';
    }
}
