package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Doctor;
import com.xworkz.isARelation.Surgeon;

public class DoctorRunner {
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        Doctor doctor1 = new Surgeon();
        Surgeon surgeon = new Surgeon();

        System.out.println("=============================");
        doctor.giveAdvice();
        doctor.conductCheckup();
        doctor.checkVitals();
        doctor.diagnose();
        doctor.prescribeMedicine();

        System.out.println("=============================");
        doctor1.giveAdvice();
        doctor1.conductCheckup();
        doctor1.checkVitals();
        doctor1.diagnose();
        doctor1.prescribeMedicine();

        System.out.println("=============================");
        surgeon.giveAdvice();
        surgeon.conductCheckup();
        surgeon.checkVitals();
        surgeon.diagnose();
        surgeon.prescribeMedicine();
    }
}
