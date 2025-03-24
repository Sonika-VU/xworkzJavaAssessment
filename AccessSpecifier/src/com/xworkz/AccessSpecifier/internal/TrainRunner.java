package com.xworkz.AccessSpecifier.internal;

import com.xworkz.AccessSpecifier.external.TrainCustomer;

public class TrainRunner {
    public static void main(String[] args) {
        TrainManager trainManager = new TrainManager();
        TrainCustomer trainCustomer = new TrainCustomer();

        trainManager.manage();
        trainCustomer.book();
    }
}
