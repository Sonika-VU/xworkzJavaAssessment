package com.xworkz.association.internal;

public class Button {
    private int noOfButton;
    private Material material;

    public Button(Material material){
        System.out.println("1-arg const of Button");
        this.material = material;
    }

    public void performFunc(){
        System.out.println("Running perfoemFunc in Remote");
        if(material != null){
            System.out.println(" Button:");
            material.setMaterialType("Plastic");
            System.out.println("\tMaterial Type : "+this.material.getMaterialType());
        }
    }

    public void setNoOfButton(int noOfButton) {
        this.noOfButton = noOfButton;
    }

    public int getNoOfButton() {
        return noOfButton;
    }
}
