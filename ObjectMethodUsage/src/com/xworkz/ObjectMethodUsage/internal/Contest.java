package com.xworkz.ObjectMethodUsage.internal;

public class Contest {
    private String title;
    private String type;
    private int participants;

    public Contest(String title, String type, int participants) {
        System.out.println("String, String, int-arg const of Contest");
        this.title = title;
        this.type = type;
        this.participants = participants;
    }

    @Override
    public String toString() {
        return "Contest{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", participants=" + participants +
                '}';
    }

    @Override
    public int hashCode() {
        return 3224;
    }

}
