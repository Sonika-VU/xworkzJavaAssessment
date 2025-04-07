package com.xworkz.isARelation;

public class IPad extends Tablet {
    public IPad() {
        super();
        System.out.println("no-arg const of iPad");
    }

    @Override
    public void browseInternet(){
//        super.browseInternet();
        System.out.println("Running browseInternet in iPad");
    }

    @Override
    public void watchVideo(){
//        super.watchVideo();
        System.out.println("Running watchVideo in iPad");
    }

    @Override
    public void takeNotes(){
//        super.takeNotes();
        System.out.println("Running takeNotes in iPad");
    }

    @Override
    public void playGames(){
//        super.playGames();
        System.out.println("Running playGames in iPad");
    }

    @Override
    public void readEbooks(){
//        super.readEbooks();
        System.out.println("Running readEbooks in iPad");
    }

    public void storeData(){
        System.out.println("Running storeData in IPad");
    }
}
