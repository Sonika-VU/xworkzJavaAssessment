package com.xworkz.isARelation.CastingClasses;

import com.xworkz.isARelation.DiningTable;
import com.xworkz.isARelation.Table;

public class Hotel {

    public void setTable(Table table){
        table.beDurable();
        table.beMovable();
        table.beStable();
        table.provideSurface();
        table.supportObjects();

        if(table instanceof DiningTable){
            DiningTable diningTable = (DiningTable) table;
            diningTable.eatFood();
        }
    }
}
