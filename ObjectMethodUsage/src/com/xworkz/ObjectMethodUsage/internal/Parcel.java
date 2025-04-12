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

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Parcel) {
                System.out.println("Ref instanceOf Parcel");
                Parcel parcel1 = this;
                Parcel  parcel2 = (Parcel) obj;
                if (parcel1.sender == parcel2.sender && parcel1.receiver == parcel2.receiver && parcel1.weight == parcel2.weight) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
