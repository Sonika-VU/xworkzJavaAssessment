package com.xworkz.ObjectMethodUsage.internal;

public class Clock {
    private String type;
    private boolean isDigital;
    private String brand;

    public Clock(String type, boolean isDigital, String brand) {
        System.out.println("String, boolean, String-arg const of Clock");
        this.type = type;
        this.isDigital = isDigital;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Clock{" +
                "type='" + type + '\'' +
                ", isDigital=" + isDigital +
                ", brand='" + brand + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return 239;
    }

    @Override
    public boolean equals(Object obj){
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Clock){
                System.out.println("Ref instanceOf Clock");
                Clock clock1 = this;
                Clock clock2 = (Clock) obj;
                if(clock1.brand == clock2.brand ){
                    System.out.println("Both are same");
                    return  true;
                }
            }
        }
        return false;
    }
}
