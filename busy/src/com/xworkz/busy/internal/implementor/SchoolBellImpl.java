package com.xworkz.busy.internal.implementor;

import com.xworkz.busy.internal.rules.BellSystem;

public class SchoolBellImpl implements BellSystem {

    public SchoolBellImpl(){
        System.out.println("no-arg const of SchoolBellImpl");
    }
    @Override
    public void ringBell() {
        System.out.println("Running ringBell in SchoolBellImpl");
    }
}
