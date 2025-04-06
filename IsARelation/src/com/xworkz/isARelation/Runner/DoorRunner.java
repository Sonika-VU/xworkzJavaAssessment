package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Door;
import com.xworkz.isARelation.WoodenDoor;

public class DoorRunner {
    public static void main(String[] args) {
        Door door = new Door();
        Door door1 = new WoodenDoor();
        WoodenDoor woodenDoor = new WoodenDoor();

        System.out.println("========================");
        door.close();
        door.lock();
        door.open();
        door.provideSecurity();
        door.unlock();

        System.out.println("========================");
        door1.close();
        door1.lock();
        door1.open();
        door1.provideSecurity();
        door1.unlock();

        System.out.println("========================");
        woodenDoor.close();
        woodenDoor.lock();
        woodenDoor.open();
        woodenDoor.provideSecurity();
        woodenDoor.unlock();
    }
}
