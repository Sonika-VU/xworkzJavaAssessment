package com.xworkz.ClassAsVariables;

public class Police {

    Jail jail = new Jail();
    Jail jail1 = new Jail();
    Jail jail2 = new Jail();
    Jail[] jails = {jail1, jail2};


    public Police(Jail jail){
        System.out.println("1-arg (jail) const in Police");
        this.jail = jail;
    }


    public void assignDetails(){
        if(jail != null){
            this.jail.setName("Parappana Agrahara");
            this.jail.setLocation("Bangalore");
            this.jail.setJailerName("Mohan Das");
            this.jail.setTotalCells(1000);
        }
        if(jail1 != null){
            jail1.setName("Central Jail");
        }
        if(jail2 != null){
            jail2.setName("Naini Central Jail");
        }
    }

    public void printDetails(){
        if(jail != null){
            System.out.println("The details of jail are: ");
            System.out.println("Jail name : "+this.jail.getJailerName());
            System.out.println("Jail Location : "+this.jail.getLocation());
            System.out.println("Jailer Name :  "+this.jail.getJailerName());
            System.out.println("No of cells : "+this.jail.getTotalCells());
        }
    }
    public void printJailsName(){
        System.out.println("Running getJailsName with no parameter in Police : ");
        for (Jail jail : jails){
            System.out.println(jail.getName());
        }
    }

    public void printLocation(Jail jail){
        System.out.println("Runing printLocation(1-arg) method in Police");
        System.out.println("The location of the Jail is : "+jail.getLocation());
    }

    public void printJailer(Jail[] jails){
        System.out.println("Running printJailer method which takes array of Jail as parameter in Police ");
        for(Jail jail : jails){
            System.out.println(jail.getJailerName());
        }
    }

}
