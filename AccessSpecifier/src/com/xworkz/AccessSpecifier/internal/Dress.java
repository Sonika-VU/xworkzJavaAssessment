package com.xworkz.AccessSpecifier.internal;

public class Dress {
    public String material = "Cotton";
    int quantity = 10;
    private  String stitchedBy = "Manish Malhotra";

    public void purchase(){
        System.out.println("Runnign purchase in Dress");
        System.out.println("Stitched By : "+this.stitchedBy);
        fixRate();
    }

    void customizeDress(){
        System.out.println("Running customizeDress in Dress");
    }

    private void fixRate(){
        System.out.println("Running fixRate in Dress");
    }
}
