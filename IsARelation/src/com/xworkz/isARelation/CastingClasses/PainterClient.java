package com.xworkz.isARelation.CastingClasses;

import com.xworkz.isARelation.Artist;
import com.xworkz.isARelation.Painter;

public class PainterClient {

    public void buyPaint(Artist artist){
        artist.useColors();
        artist.sketch();
        artist.displayArt();
        artist.visualize();
        artist.createArt();

        if(artist instanceof Painter){
            Painter painter = new Painter();
            painter.sellPaintings();
        }
    }
}
