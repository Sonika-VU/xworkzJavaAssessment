package com.xworkz.association.internal;

public class Material {
    private String materialType;

    public Material(){
        System.out.println("no-arg const of Material");
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    public String getMaterialType() {
        return materialType;
    }
}
