package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.*;

public class RubberRunner {
    public static void main(String[] args) {
        Rubber rubber = new Rubber();
        Rubber rubber1 = new Tyre();

        rubber1.expand();
        ((Tyre) rubber1).compress();
        Tyre tyre = new Tyre();
        MRFTyre mrfTyre = new MRFTyre();

        ArmyVehicle armyVehicle = new ArmyVehicle();

        rubber.expand();
        rubber1.expand();
        tyre.expand();
        mrfTyre.expand();

        armyVehicle.wheel(rubber);
        armyVehicle.wheel(rubber1);
        armyVehicle.wheel(tyre);
        armyVehicle.wheel(mrfTyre);




    }
}
