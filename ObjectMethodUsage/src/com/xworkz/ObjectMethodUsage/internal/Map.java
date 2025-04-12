package com.xworkz.ObjectMethodUsage.internal;

public class Map {
    private String country;
    private int length;
    private boolean isColored;

    public Map(String country, int length, boolean isColored){
        System.out.println("String, int, boolean-arg const of Map");
        this.country = country;
        this.length = length;
        this.isColored = isColored;
    }

    @Override
    public String toString() {
        return "Map{" +
                "country='" + country + '\'' +
                ", length=" + length +
                ", isColored=" + isColored +
                '}';
    }

    @Override
    public int hashCode() {
        return -78790;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Map) {
                System.out.println("Ref instanceOf Map");
                Map map1 = this;
                Map  map2 = (Map) obj;
                if (map1.country == map2.country && map2.length == map1.length) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
