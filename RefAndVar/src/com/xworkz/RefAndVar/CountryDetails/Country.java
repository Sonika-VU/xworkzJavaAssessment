package com.xworkz.RefAndVar.CountryDetails;

public class Country {

    String name;
    String pm;
    String president;
    String nationalFlag;
    PrimeMinister primeMinister = new PrimeMinister("Narendra Modi", "India", 2025, 16);

    Country(String name, String pm, String president, String nationalFlag){
        this.name = name;
        this.pm = pm;
        this.president = president;
        this.nationalFlag = nationalFlag;
    }


    void display(){
        System.out.println("In Country : ");
        System.out.println("Name : "+this.name);
        System.out.println("PrimeMinister : "+this.pm);
        System.out.println("President : "+this.president);
        System.out.println("FLag : "+this.nationalFlag);
        System.out.println("====================================");
        primeMinister.display();
    }
}
