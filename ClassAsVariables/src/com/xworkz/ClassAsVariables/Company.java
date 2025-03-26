package com.xworkz.ClassAsVariables;

public class Company {
    IdCard idCard = new IdCard();
    String[] colors = {"White", "Blue", "Red"};

    public Company(){
        System.out.println("no-arg const of Company");
    }

    public void assignDetails(){
        idCard.setMaterial("Plastic");
        idCard.setColors(colors);
        idCard.setWeight(30);
        idCard.setDesignedBy("Praveen Studio");
    }

    public void printDetails(){
        if(idCard != null){
            System.out.println("Material : "+this.idCard.getMaterial());
            String[] idColor = this.idCard.getColors();
            System.out.print("Colors  : ");
            for(String color : idColor){
                System.out.print(color+" ");
            }
            System.out.println();
            System.out.println("Weight : "+this.idCard.getWeight());
            System.out.println("Designed by : "+this.idCard.getDesignedBy());
        }
    }

    public void printIdMaterial(IdCard idCard){
        System.out.println("Running getIdMaterial in Company");
        System.out.println("Material : "+this.idCard.getMaterial());
    }

    public void printIdsWeight(IdCard[] idCards){
        System.out.println("Running printIdsWeight(takses array as parameter) in Company");
        System.out.print("Weights of IdCard's : ");
        for (IdCard idCard : idCards){
            System.out.print(idCard.getWeight()+" ");
        }

    }

}
