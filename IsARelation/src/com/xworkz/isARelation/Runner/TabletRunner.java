package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.IPad;
import com.xworkz.isARelation.Tablet;
import javafx.scene.control.Tab;

public class TabletRunner {
    public static void main(String[] args) {
        Tablet tablet = new Tablet();
        Tablet tablet1= new IPad();
        IPad iPad = new IPad();

        System.out.println("========================");
        tablet.browseInternet();
        tablet.playGames();
        tablet.readEbooks();
        tablet.takeNotes();
        tablet.watchVideo();

        System.out.println("========================");
        tablet1.browseInternet();
        tablet1.playGames();
        tablet1.readEbooks();
        tablet1.takeNotes();
        tablet1.watchVideo();

        System.out.println("========================");
        iPad.browseInternet();
        iPad.playGames();
        iPad.readEbooks();
        iPad.takeNotes();
        iPad.watchVideo();

    }
}
