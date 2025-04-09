package com.xworkz.ObjectMethodUsage.internal;

public class Award {
    private String awardName;
    private String category;
    private int yearWon;

    public Award(String awardName, String category, int yearWon) {
        System.out.println("String, String, int-arg const of Award");
        this.awardName = awardName;
        this.category = category;
        this.yearWon = yearWon;
    }

    @Override
    public String toString() {
        return "Award{" +
                "awardName='" + awardName + '\'' +
                ", category='" + category + '\'' +
                ", yearWon=" + yearWon +
                '}';
    }
}
