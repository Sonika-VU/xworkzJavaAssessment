package com.xworkz.ObjectMethodUsage.internal;

public class Tattoo {
    private String design;
    private String location;
    private boolean isColored;

    public Tattoo(String design, String location, boolean isColored) {
        System.out.println("String, String, boolean-arg const of Tattoo");
        this.design = design;
        this.location = location;
        this.isColored = isColored;
    }

    @Override
    public String toString() {
        return "Tattoo{" +
                "design='" + design + '\'' +
                ", location='" + location + '\'' +
                ", isColored=" + isColored +
                '}';
    }
}
