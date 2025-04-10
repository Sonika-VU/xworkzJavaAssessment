package com.xworkz.ObjectMethodUsage.internal;

public class Painting {
    private String artist;
    private String title;
    private int yearCreated;

    public Painting(String artist, String title, int yearCreated) {
        System.out.println("String, String, int-arg const of Painting");
        this.artist = artist;
        this.title = title;
        this.yearCreated = yearCreated;
    }

    @Override
    public String toString() {
        return "Painting{" +
                "artist='" + artist + '\'' +
                ", title='" + title + '\'' +
                ", yearCreated=" + yearCreated +
                '}';
    }

    @Override
    public int hashCode() {
        return 143;
    }
}
