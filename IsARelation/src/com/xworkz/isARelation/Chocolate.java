package com.xworkz.isARelation;

public class Chocolate extends Factory{

    public Chocolate(){
        super();
        System.out.println("no-arg const of Chocolate");
    }

    {
        super.getEmployee();
        System.out.println("Running getEmployee in Chocolate");
    }

    {
        super.setEquipments();
        System.out.println("Running setEquipments in Chocolate");
    }

    {
        super.manufacture();
        System.out.println("Running manufacture in Chocolate");
    }

    {
        super.selectItem();
        System.out.println("Running selectItem in Chocolate");
    }

    {
        super.produceProduct();
        System.out.println("Running produceProduct in Chocolate");
    }
}
