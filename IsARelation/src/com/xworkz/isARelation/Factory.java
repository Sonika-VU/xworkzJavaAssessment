package com.xworkz.isARelation;

public class Factory {
    public Factory(){
        System.out.println("no-arg const of Factory");
    }

    public void getEmployee(){
        System.out.println("Running getEmployee in Factory");
    }

    public void setEquipments(){
        System.out.println("Running setEquipments in Factory");
    }

    public void manufacture(){
        System.out.println("Running manufacture in Factory");
    }

    public void selectItem(){
        System.out.println("Running selectItem in Factory");
    }

    public void produceProduct(){
        System.out.println("Running produceProduct in Factory");
    }
}
