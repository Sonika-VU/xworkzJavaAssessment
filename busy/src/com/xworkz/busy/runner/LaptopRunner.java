package com.xworkz.busy.runner;

import com.xworkz.busy.external.OperatingSystem;
import com.xworkz.busy.internal.implementor.LaptopImpl;
import com.xworkz.busy.internal.rules.Laptop;

public class LaptopRunner {
    public static void main(String[] args) {
        Laptop laptop = new LaptopImpl();
        OperatingSystem operatingSystem = new OperatingSystem(laptop);

        operatingSystem.setUp();
    }
}
