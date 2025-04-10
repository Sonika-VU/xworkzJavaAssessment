package com.xworkz.ObjectMethodUsage.internal;

public class Podcast {
    private String title;
    private String host;
    private int episodes;

    public Podcast(String title, String host, int episodes) {
        System.out.println("String, String, int-arg const of Podcast");
        this.title = title;
        this.host = host;
        this.episodes = episodes;
    }

    @Override
    public String toString() {
        return "Podcast{" +
                "title='" + title + '\'' +
                ", host='" + host + '\'' +
                ", episodes=" + episodes +
                '}';
    }

    @Override
    public int hashCode() {
        return -856;
    }
}
