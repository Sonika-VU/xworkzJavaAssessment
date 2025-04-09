package com.xworkz.ObjectMethodUsage.internal;

public class Festival {
    private String name;
    private String month;
    private boolean isNationalHoliday;

    public Festival(String name, String month, boolean isNationalHoliday) {
        System.out.println("String, String, boolean-arg const of Festival");
        this.name = name;
        this.month = month;
        this.isNationalHoliday = isNationalHoliday;
    }

    @Override
    public String toString() {
        return "Festival{" +
                "name='" + name + '\'' +
                ", month='" + month + '\'' +
                ", isNationalHoliday=" + isNationalHoliday +
                '}';
    }
}
