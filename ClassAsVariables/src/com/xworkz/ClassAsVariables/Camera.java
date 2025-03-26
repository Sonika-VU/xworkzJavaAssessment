package com.xworkz.ClassAsVariables;

import org.omg.CORBA.PRIVATE_MEMBER;

public class Camera {

    private String brand;
    private int price;
    private CameraType cameraType;
    private String connectivity;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}
