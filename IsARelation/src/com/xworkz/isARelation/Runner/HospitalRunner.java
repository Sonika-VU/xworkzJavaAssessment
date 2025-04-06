package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.GovtHospital;
import com.xworkz.isARelation.Hospital;

public class HospitalRunner {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        Hospital hospital1 = new GovtHospital();
        GovtHospital govtHospital = new GovtHospital();

        System.out.println("==========================");
        hospital.issueTablets();
        hospital.admitPatients();
        hospital.checkEye();
        hospital.checkPatients();
        hospital.surgery();

        System.out.println("==========================");
        hospital1.issueTablets();
        hospital1.admitPatients();
        hospital1.checkEye();
        hospital1.checkPatients();
        hospital1.surgery();

        System.out.println("==========================");
        govtHospital.issueTablets();
        govtHospital.admitPatients();
        govtHospital.checkEye();
        govtHospital.checkPatients();
        govtHospital.surgery();
    }
}
