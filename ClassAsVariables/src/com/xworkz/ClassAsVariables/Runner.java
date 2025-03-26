package com.xworkz.ClassAsVariables;

public class Runner {

    public static void main(String[] args) {
        Jail jail = new Jail();
        Jail jail1 = new Jail();
        Jail jail2 = new Jail();
        Police police = new Police(jail);

        jail1.setLocation("Bangalore");
        jail1.setJailerName("Ramesh");
        jail2.setJailerName("Suresh");
        Jail[] jails = {jail1, jail2};

        police.assignDetails();
        police.printDetails();
        police.printJailsName();
        police.printLocation(jail);
        police.printJailer(jails);

        System.out.println("====================================");
        Company company = new Company();
        IdCard idCard1 = new IdCard();
        IdCard idCard2 = new IdCard();
        idCard1.setMaterial("Plastic");
        idCard1.setWeight(30);
        idCard2.setWeight(40);

        IdCard[] idCards = {idCard1, idCard2};


        company.assignDetails();
        company.printDetails();
        company.printIdMaterial(idCard1);
        company.printIdsWeight(idCards);

        System.out.println("==================================");

        Earth earth = new Earth();
        Alien alien1 = new Alien();
        alien1.setSeenBy("Kumar");

        earth.assignDetails();
        earth.printDetails();
        earth.printSeenBy(alien1);


    }
}
