package com.xworkz.ObjectMethodUsage.internal;

public class Drone {
    private String model;
    private double range;
    private boolean cameraAvailable;

    public Drone(String model, double range, boolean cameraAvailable) {
        System.out.println("String, double, boolean-arg const of Drone");
        this.model = model;
        this.range = range;
        this.cameraAvailable = cameraAvailable;
    }

    @Override
    public String toString() {
        return "Drone{" +
                "model='" + model + '\'' +
                ", range=" + range +
                ", cameraAvailable=" + cameraAvailable +
                '}';
    }

    @Override
    public int hashCode() {
        return -30294;
    }

    @Override
    public boolean equals(Object obj){
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Drone){
                System.out.println("Ref instanceOf Drone");
                Drone drone1 = this;
                Drone drone2 = (Drone) obj;
                if(drone1.model == drone2.model ){
                    System.out.println("Both are same");
                    return  true;
                }
            }
        }
        return false;
    }
}
