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

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Painting) {
                System.out.println("Ref instanceOf Painting");
                Painting painting1 = this;
                Painting  painting2 = (Painting) obj;
                if (painting1.artist == painting2.artist && painting1.title == painting2.title) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
