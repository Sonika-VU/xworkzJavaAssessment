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

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Lodge) {
                System.out.println("Ref instanceOf Lodge");
                Lodge lodge1 = this;
                Lodge  lodge2 = (Lodge) obj;
                if (lodge1.roomCapacity == lodge2.roomCapacity && lodge1.rentPerDay == lodge2.rentPerDay) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
