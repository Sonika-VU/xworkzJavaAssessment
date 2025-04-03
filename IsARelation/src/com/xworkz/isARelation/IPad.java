package com.xworkz.isARelation;

public class IPad extends Tablet {
    public IPad() {
        super();
        System.out.println("no-arg const of iPad");
    }

    {
        super.browseInternet();
        System.out.println("Running browseInternet in iPad");
    }

    {
        super.watchVideo();
        System.out.println("Running watchVideo in iPad");
    }

    {
        super.takeNotes();
        System.out.println("Running takeNotes in iPad");
    }

    {
        super.playGames();
        System.out.println("Running playGames in iPad");
    }

    {
        super.readEbooks();
        System.out.println("Running readEbooks in iPad");
    }
}
