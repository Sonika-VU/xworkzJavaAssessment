package com.xworkz.ClassAsVariables;

public class Earth {
    Alien alien = new Alien();

    public Earth(){
        System.out.println("no-arg const of Earth");
    }

    public void assignDetails(){
        if(alien != null){
            alien.setSeenBy("Monika");
            alien.setDate("23-03-2025");
            alien.setDescribe("A yellow colored gaint alien");
        }
    }

    public void printDetails(){
        System.out.println("Running printDetails(no-arg) method in Earth");
        if(alien != null){
            System.out.println("Seen by : "+alien.getSeenBy());
            System.out.println("Date : "+alien.getDate());
            System.out.println("Describe : "+alien.getDescribe());
        }
    }

    public void printSeenBy(Alien alien){
        System.out.println("Running printSeenBy(1-arg) method in Earth");
        if(alien != null){
            System.out.println("Seen by: "+alien.getSeenBy());
        }
    }

}
