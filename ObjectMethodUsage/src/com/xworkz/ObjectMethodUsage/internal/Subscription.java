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

    @Override
    public int hashCode() {
        return 999;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Subscription) {
                System.out.println("Ref instanceOf Subscription");
                Subscription subscription1 = this;
                Subscription  subscription2 = (Subscription) obj;
                if (subscription2.planType == subscription1.planType && subscription2.userName == subscription1.userName && subscription2.validityDays == subscription1.validityDays) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
