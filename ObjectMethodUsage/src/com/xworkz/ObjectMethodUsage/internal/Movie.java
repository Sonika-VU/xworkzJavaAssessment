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
                ", hero='" + hero + '\'' +
                ", rating=" + rating +
                '}';
    }

    @Override
    public int hashCode() {
        return 365721756;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Movie) {
                System.out.println("Ref instanceOf Movie");
                Movie movie1 = this;
                Movie  movie2 = (Movie) obj;
                if (movie1.hero == movie2.hero && movie1.rating == movie2.rating) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
