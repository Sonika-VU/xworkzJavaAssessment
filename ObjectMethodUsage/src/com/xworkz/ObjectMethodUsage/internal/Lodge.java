package com.xworkz.ObjectMethodUsage.internal;

public class Lodge {
    private  String name;
    private int roomCapacity;
    private double rentPerDay;

    public Lodge(String name, int roomCapacity, double rentPerDay){
        System.out.println("String, int, double-arg cosnt of Lodge");
        this.name = name;
        this.roomCapacity = roomCapacity;
        this.rentPerDay = rentPerDay;
    }

    @Override
    public String toString() {
        return "Lodge{" +
                "name='" + name + '\'' +
                ", roomCapacity=" + roomCapacity +
                ", rentPerDay=" + rentPerDay +
                '}';
    }

    @Override
    public int hashCode() {
        return 6859;
    }
}
