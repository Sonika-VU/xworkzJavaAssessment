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

    @Override
    public int hashCode() {
        return 50;
    }

    @Override
    public boolean equals(Object obj){
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Festival){
                System.out.println("Ref instanceOf Festival");
                Festival festival1 = this;
                Festival festival2 = (Festival) obj;
                if(festival1.name == festival2.name && festival1.month == festival2.month ){
                    System.out.println("Both are same");
                    return  true;
                }
            }
        }
        return false;
    }
}
