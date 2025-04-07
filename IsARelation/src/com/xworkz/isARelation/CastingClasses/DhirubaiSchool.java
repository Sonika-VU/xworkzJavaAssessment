package com.xworkz.isARelation.CastingClasses;

import com.xworkz.isARelation.IPad;
import com.xworkz.isARelation.Tablet;

public class DhirubaiSchool {

    public void provideIPad(Tablet tablet){
        tablet.browseInternet();
        tablet.playGames();
        tablet.readEbooks();
        tablet.takeNotes();
        tablet.watchVideo();

        if(tablet instanceof IPad){
            IPad iPad = (IPad) tablet;
            iPad.storeData();
        }
    }
}
