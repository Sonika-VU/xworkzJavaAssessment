package com.xworkz.ClassAsVariables;

public class Alien {

    private String seenBy;
    private String date;
    private String describe;

    public Alien(){
        System.out.println("no-arg const of Alien");
    }

    public String getSeenBy() {
        return seenBy;
    }

    public void setSeenBy(String seenBy) {
        this.seenBy = seenBy;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
}
