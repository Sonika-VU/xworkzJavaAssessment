package com.xworkz.isARelation.childClasses;

import com.xworkz.isARelation.parentClasses.Party;

public class KittyParty extends Party {
    @Override
    public void organize() {
        System.out.println("Running organize in KittyParty");
    }
}
