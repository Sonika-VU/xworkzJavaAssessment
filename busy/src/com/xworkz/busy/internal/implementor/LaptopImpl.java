package com.xworkz.busy.internal.implementor;

import com.xworkz.busy.internal.rules.Laptop;

public class LaptopImpl implements Laptop {

    public LaptopImpl(){
        System.out.println("no-arg const of LaptopImpl");
    }

    @Override
    public void process() {
        System.out.println("Running process in LaptopImpl");
    }
}
