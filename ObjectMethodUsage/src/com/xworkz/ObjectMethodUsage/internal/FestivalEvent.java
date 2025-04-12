package com.xworkz.ObjectMethodUsage.internal;

public class FestivalEvent {
    private String name;
    private String location;
    private String date;

    public FestivalEvent(String name, String location, String date) {
        System.out.println("String, String, String-arg const of FestivalEvent");
        this.name = name;
        this.location = location;
        this.date = date;
    }

    @Override
    public String toString() {
        return "FestivalEvent{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return 904384534;
    }

    @Override
    public boolean equals(Object obj){
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof FestivalEvent){
                System.out.println("Ref instanceOf FestivalEvent");
                FestivalEvent festivalEvent1 = this;
                FestivalEvent festivalEvent2 = (FestivalEvent) obj;
                if(festivalEvent1.name == festivalEvent2.name && festivalEvent1.location == festivalEvent2.location ){
                    System.out.println("Both are same");
                    return  true;
                }
            }
        }
        return false;
    }
}
