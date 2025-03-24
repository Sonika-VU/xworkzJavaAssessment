package com.xworkz.AccessSpecifier.internal;

import com.xworkz.AccessSpecifier.external.BottleCustomer;

public class BottleRunner {
    public static void main(String[] args) {
        BottleManufacturer bottleManufacturer = new BottleManufacturer();
        BottleCustomer bottleCustomer = new BottleCustomer();

        bottleManufacturer.manufactureBottle();
        bottleCustomer.purchase();
    }
}
