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
}
