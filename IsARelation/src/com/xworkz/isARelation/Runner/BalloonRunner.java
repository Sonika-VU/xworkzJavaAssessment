package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Balloon;
import com.xworkz.isARelation.Factory;

public class BalloonRunner {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Factory factory1 = new Balloon();
        Balloon balloon = new Balloon();

        factory.selectItem();
        factory.manufacture();
        factory.getEmployee();
        factory.produceProduct();
        factory.setEquipments();

        System.out.println("==============================");

        factory1.selectItem();
        factory1.manufacture();
        factory1.getEmployee();
        factory1.produceProduct();
        factory1.setEquipments();

        System.out.println("==============================");

        balloon.selectItem();
        balloon.manufacture();
        balloon.getEmployee();
        balloon.produceProduct();
        balloon.setEquipments();

        System.out.println("==============================");
    }
}
