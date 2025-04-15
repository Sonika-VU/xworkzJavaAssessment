package com.xworkz.abstractKeyword.external;

public class Lodge {

    private String name;
    private String location;
    private int roomCapacity;
    private int rentPerDay;

    public Lodge(String name){
        this.name = name;
    }

    public Lodge(String name, String location){
        this(name);
        this.location = location;
    }

    public Lodge(String name, String location, int roomCapacity, int rentPerDay){
        this(name,  location);
        this.roomCapacity = roomCapacity;
        this.rentPerDay = rentPerDay;
    }

    @Override
    public String toString() {
        return "Lodge{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", roomCapacity=" + roomCapacity +
                ", rentPerDay=" + rentPerDay +
                '}';
    }
}
