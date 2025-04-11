package com.xworkz.ObjectMethodUsage.internal;

public class Currency {
    private String country;
    private String name;
    private double exchangeRate;

    public Currency(String country, String name, double exchangeRate) {
        System.out.println("String, String, double-arg const of Currency");
        this.country = country;
        this.name = name;
        this.exchangeRate = exchangeRate;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "country='" + country + '\'' +
                ", name='" + name + '\'' +
                ", exchangeRate=" + exchangeRate +
                '}';
    }

    @Override
    public int hashCode() {
        return 3949;
    }

    @Override
    public boolean equals(Object obj){
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Currency){
                System.out.println("Ref instanceOf Antique");
                Currency currency1 = this;
                Currency currency2 = (Currency) obj;
                if(currency1.name == currency2.name ){
                    System.out.println("Both are same");
                    return  true;
                }
            }
        }
        return false;
    }
}
