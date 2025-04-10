package com.xworkz.ObjectMethodUsage.internal;

public class Parcel {
    private String sender;
    private String receiver;
    private double weight;

    public Parcel(String sender, String receiver, double weight) {
        System.out.println("String, String, double-arg const of Parcel");
        this.sender = sender;
        this.receiver = receiver;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Parcel{" +
                "sender='" + sender + '\'' +
                ", receiver='" + receiver + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int hashCode() {
        return 243;
    }
}
