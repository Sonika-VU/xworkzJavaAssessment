package com.xworkz.association.internal;

public class Remote {
    private String size;
    private String color;
    private Battery battery;

    public Remote(Battery battery){
        System.out.println("1-arg const in Remote");
        this.battery = battery;
    }

    public void pressKey(){
        System.out.println("Running pressKey in Remote");
        if(battery != null){
            System.out.println("Battery : ");
            battery.setVolt(500);
            battery.setCost(50);
            System.out.println("\tBattery volts : "+battery.getVolt());
            System.out.println("\tBattery cost : "+battery.getCost());
            battery.convertEnergy();
        }
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }
}
