package com.xworkz.isARelation;

public class Chocolate extends Factory{

    public Chocolate(){
        super();
        System.out.println("no-arg const of Chocolate");
    }

    @Override
    public void getEmployee(){
//        super.getEmployee();
        System.out.println("Running getEmployee in Chocolate");
    }

    @Override
    public void setEquipments(){
//        super.setEquipments();
        System.out.println("Running setEquipments in Chocolate");
    }

    @Override
    public void manufacture(){
//        super.manufacture();
        System.out.println("Running manufacture in Chocolate");
    }

    @Override
    public void selectItem(){
//        super.selectItem();
        System.out.println("Running selectItem in Chocolate");
    }

    @Override
    public void produceProduct(){
//        super.produceProduct();
        System.out.println("Running produceProduct in Chocolate");
    }
}
