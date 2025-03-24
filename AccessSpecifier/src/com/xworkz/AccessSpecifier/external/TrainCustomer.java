package com.xworkz.AccessSpecifier.external;

import com.xworkz.AccessSpecifier.internal.Train;

public class TrainCustomer {
    Train train = new Train();

    public void book(){
        System.out.println(train.name);
        train.bookSeat();
    }
}
