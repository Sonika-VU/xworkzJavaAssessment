package com.xworkz.ObjectMethodUsage.internal;

public class Movie {
    private String name;
    private String hero;
    private double rating;

    public Movie(String name, String genre, double rating) {
        System.out.println("String, String, double-arg const of Movie");
        this.name = name;
        this.hero = genre;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", genre='" + hero + '\'' +
                ", rating=" + rating +
                '}';
    }

    @Override
    public int hashCode() {
        return 365721756;
    }
}
