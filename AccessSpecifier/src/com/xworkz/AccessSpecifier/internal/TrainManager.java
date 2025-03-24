package com.xworkz.AccessSpecifier.internal;

public class TrainManager {
    Train train = new Train();
    void manage(){
        System.out.println(train.name);
        System.out.println(train.startingPoint);
        train.bookSeat();
        train.chooseDestination();
    }
}
