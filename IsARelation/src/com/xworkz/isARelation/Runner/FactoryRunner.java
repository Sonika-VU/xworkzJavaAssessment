package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Chocolate;
import com.xworkz.isARelation.Factory;

public class FactoryRunner {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Factory factory1 = new Chocolate();
        Chocolate chocolate = new Chocolate();

        System.out.println("======================");
        factory.setEquipments();
        factory.produceProduct();
        factory.getEmployee();
        factory.manufacture();
        factory.selectItem();

        System.out.println("======================");
        factory1.setEquipments();
        factory1.produceProduct();
        factory1.getEmployee();
        factory1.manufacture();
        factory1.selectItem();

        System.out.println("======================");
        chocolate.setEquipments();
        chocolate.produceProduct();
        chocolate.getEmployee();
        chocolate.manufacture();
        chocolate.selectItem();
    }
}
