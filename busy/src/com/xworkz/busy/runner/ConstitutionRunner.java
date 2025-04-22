package com.xworkz.busy.runner;

import com.xworkz.busy.external.Government;
import com.xworkz.busy.internal.implementor.CitizenConstitutionImpl;
import com.xworkz.busy.internal.rules.Constitution;

public class ConstitutionRunner {
    public static void main(String[] args) {
        Constitution constitution = new CitizenConstitutionImpl();
        Government government = new Government(constitution);

        government.rule();
    }
}
