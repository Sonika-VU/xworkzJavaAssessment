package com.xworkz.RefAndVar.EducationDetails;

import com.sun.org.apache.xml.internal.utils.StringVector;

public class Transport {
    String state;
    String vehicleType;
    String vehNo;
    int noOfPassenge;

    Transport(String state, String vehicleType, String vehNo, int noOfPassenge){
        this.state = state;
        this.vehicleType = vehicleType;
        this.vehNo = vehNo;
        this.noOfPassenge = noOfPassenge;
    }

    void display(){
        System.out.println("In Transport : ");
        System.out.println("State : "+this.state);
        System.out.println("Vehicle type : "+this.vehicleType);
        System.out.println("Vehicle no : "+this.vehNo);
        System.out.println("No of passengers : "+this.noOfPassenge);
        System.out.println("===========================================");


    }
}
