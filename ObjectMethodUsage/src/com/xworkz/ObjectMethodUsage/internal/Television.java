
package com.xworkz.ObjectMethodUsage.internal;

public class Television {
    private String company;
    private int inch;
    private double cost;

    public Television(String company, int inch, double cost){
        System.out.println("String, int, double-arg const of Television");
        this.company = company;
        this.inch = inch;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Television{" +
                "company='" + company + '\'' +
                ", inch=" + inch +
                ", cost=" + cost +
                '}';
    }

    @Override
    public int hashCode() {
        return 30000;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Television) {
                System.out.println("Ref instanceOf Television");
                Television television1 = this;
                Television  television2 = (Television) obj;
                if (television2.cost == television1.cost && television2.inch == television1.inch && television2.company == television1.company) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
