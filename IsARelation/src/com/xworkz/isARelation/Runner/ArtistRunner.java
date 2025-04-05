package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Artist;
import com.xworkz.isARelation.Painter;

public class ArtistRunner {
    public static void main(String[] args) {
        Artist artist = new Artist();
        Artist artist1 = new Painter();
        Painter painter = new Painter();

        artist.visualize();
        artist.createArt();
        artist.displayArt();
        artist.sketch();
        artist.useColors();

        System.out.println("===========================");

        artist1.visualize();
        artist1.createArt();
        artist1.displayArt();
        artist1.sketch();
        artist1.useColors();

        System.out.println("=============================");

        painter.visualize();
        painter.createArt();
        painter.displayArt();
        painter.sketch();
        painter.useColors();
    }
}
