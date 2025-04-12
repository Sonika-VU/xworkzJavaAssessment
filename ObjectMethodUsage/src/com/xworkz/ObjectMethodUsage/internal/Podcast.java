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

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Podcast) {
                System.out.println("Ref instanceOf Podcast");
                Podcast podcast1 = this;
                Podcast  podcast2 = (Podcast) obj;
                if (podcast1.title == podcast2.title && podcast1.host == podcast2.host && podcast1.episodes == podcast2.episodes) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
