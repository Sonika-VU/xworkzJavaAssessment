package com.xworkz.ObjectMethodUsage.internal;

public class ComicBook {
    private String title;
    private String superhero;
    private int issueNumber;

    public ComicBook(String title, String superhero, int issueNumber) {
        System.out.println("String, String, int-arg const of ComicBook");
        this.title = title;
        this.superhero = superhero;
        this.issueNumber = issueNumber;
    }

    @Override
    public String toString() {
        return "ComicBook{" +
                "title='" + title + '\'' +
                ", superhero='" + superhero + '\'' +
                ", issueNumber=" + issueNumber +
                '}';
    }
}
