package com.xworkz.busy.runner;

import com.xworkz.busy.external.HospitalLab;
import com.xworkz.busy.internal.implementor.BloodTestImpl;
import com.xworkz.busy.internal.rules.LabTester;

public class LabTesterRunner {
    public static void main(String[] args) {
        LabTester labTester = new BloodTestImpl();
        HospitalLab hospitalLab = new HospitalLab(labTester);

        hospitalLab.testBlood();
    }
}
