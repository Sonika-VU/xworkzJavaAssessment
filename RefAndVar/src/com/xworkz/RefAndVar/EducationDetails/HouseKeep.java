package com.xworkz.RefAndVar.EducationDetails;

public class HouseKeep {

    String houseName ;
    String ownerName;
    int houseNumber;
    String area;


    HouseKeep(String houseName, String ownerName, int houseNumber, String area){
        this.houseName = houseName;
        this.ownerName = ownerName;
        this.houseNumber = houseNumber;
        this.area = area;
    }

    Transport transport = new Transport("Karnataka","Bus", "KA170843", 40);

    void display(){
        System.out.println("In HouseKeep : ");
        System.out.println("house name : "+this.houseName);
        System.out.println("Owner name : "+this.ownerName);
        System.out.println("House number :"+this.houseNumber);
        System.out.println("Area : "+this.area);
        System.out.println("=================================");

        transport.display();
    }
}
