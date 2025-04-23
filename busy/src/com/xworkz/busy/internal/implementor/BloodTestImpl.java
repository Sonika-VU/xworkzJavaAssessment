package com.xworkz.busy.internal.implementor;

import com.xworkz.busy.internal.rules.LabTester;

public class BloodTestImpl implements LabTester {
    public BloodTestImpl(){
        System.out.println("no-arg const of BloodTestImpl");
    }
    @Override
    public void runTest() {
        System.out.println("Running runTest in BloodTest");
    }
}
