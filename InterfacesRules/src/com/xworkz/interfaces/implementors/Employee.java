package com.xworkz.interfaces.implementors;


import com.xworkz.interfaces.connectors.Company;

public class Employee implements Company {
    @Override
    public void entryTiming() {

    }

    @Override
    public void signOff() {

    }

    @Override
    public void deadline() {

    }

    @Override
    public void completeTask() {
        Company.super.completeTask();
    }
}
