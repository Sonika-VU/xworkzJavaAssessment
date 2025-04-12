package com.xworkz.ObjectMethodUsage.internal;

public class InsurancePolicy {
    private String policyHolder;
    private double amount;
    private int durationYears;

    public InsurancePolicy(String policyHolder, double amount, int durationYears) {
        System.out.println("String, double, int-arg const of InsurancePolicy");
        this.policyHolder = policyHolder;
        this.amount = amount;
        this.durationYears = durationYears;
    }

    @Override
    public String toString() {
        return "InsurancePolicy{" +
                "policyHolder='" + policyHolder + '\'' +
                ", amount=" + amount +
                ", durationYears=" + durationYears +
                '}';
    }

    @Override
    public int hashCode() {
        return -2342;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof InsurancePolicy) {
                System.out.println("Ref instanceOf InsurancePolicy");
                InsurancePolicy insurancePolicy1 = this;
                InsurancePolicy  insurancePolicy2 = (InsurancePolicy) obj;
                if (insurancePolicy1.amount == insurancePolicy2.amount && insurancePolicy1.durationYears == insurancePolicy2.durationYears) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }

}
