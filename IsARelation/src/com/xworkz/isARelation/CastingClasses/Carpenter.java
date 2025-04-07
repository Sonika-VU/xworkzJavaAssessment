package com.xworkz.isARelation.CastingClasses;

import com.xworkz.isARelation.Door;
import com.xworkz.isARelation.WoodenDoor;

public class Carpenter {

    public void makeDoor(Door door){
        door.close();
        door.lock();
        door.open();
        door.provideSecurity();
        door.unlock();

        if(door instanceof WoodenDoor){
            WoodenDoor woodenDoor = (WoodenDoor) door;
            woodenDoor.makeDesign();
        }
    }
}
