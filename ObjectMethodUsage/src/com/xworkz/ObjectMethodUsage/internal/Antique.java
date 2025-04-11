package com.xworkz.ObjectMethodUsage.internal;

public class Antique {
    private String name;
    private int ageInYears;
    private String originCountry;

    public Antique(String name, int ageInYears, String originCountry) {
        System.out.println("String, int, String-arg const of Antique");
        this.name = name;
        this.ageInYears = ageInYears;
        this.originCountry = originCountry;
    }

    @Override
    public String toString() {
        return "Antique{" +
                "name='" + name + '\'' +
                ", ageInYears=" + ageInYears +
                ", originCountry='" + originCountry + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default value : "+super.hashCode());
        return 99;
    }

    @Override
    public boolean equals(Object obj){
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Antique){
                System.out.println("Ref instanceOf Antique");
                Antique antique1 = this;
                Antique antique2 = (Antique) obj;
                if(antique1.name == antique2.name ){
                    System.out.println("Both are same");
                    return  true;
                }
            }
        }
        return false;
    }
}
