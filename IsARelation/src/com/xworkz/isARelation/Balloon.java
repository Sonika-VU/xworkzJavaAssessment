package com.xworkz.isARelation;

public class Balloon extends Factory{
    public Balloon(){
        super();
        System.out.println("no-arg const of Balloon");
    }

    {
        super.getEmployee();
        System.out.println("Running getEmployee in Balloon");
    }

    {
        super.setEquipments();
        System.out.println("Running setEquipments in Balloon");
    }

    {
        super.manufacture();
        System.out.println("Running manufacture in Balloon");
    }

    {
        super.selectItem();
        System.out.println("Running selectItem in Balloon");
    }

    {
        super.produceProduct();
        System.out.println("Running produceProduct in Balloon");
    }
}
