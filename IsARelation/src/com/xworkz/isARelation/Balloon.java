package com.xworkz.isARelation;

public class Balloon extends Factory{
    public Balloon(){
        super();
        System.out.println("no-arg const of Balloon");
    }

    @Override
    public void getEmployee(){
//        super.getEmployee();
        System.out.println("Running getEmployee in Balloon");
    }

    @Override
    public void setEquipments(){
//        super.setEquipments();
        System.out.println("Running setEquipments in Balloon");
    }

    @Override
    public void manufacture(){
//        super.manufacture();
        System.out.println("Running manufacture in Balloon");
    }

    @Override
    public void selectItem(){
//        super.selectItem();
        System.out.println("Running selectItem in Balloon");
    }

    @Override
    public void produceProduct(){
//        super.produceProduct();
        System.out.println("Running produceProduct in Balloon");
    }

    public void fillAir(){
        System.out.println("Running fillAir in Balloon");
    }
}
