package com.xworkz.busy.external;

import com.xworkz.busy.internal.rules.LabTester;

public class HospitalLab {
    LabTester labTester;

    public HospitalLab(LabTester labTester){
        this.labTester = labTester;
        System.out.println("labTester-arg const of HospitalLab");
    }

    public void testBlood(){
        System.out.println("Running testBlood in HospitalLab");
        if(this.labTester != null){
            this.labTester.runTest();
        }
    }
}
