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

    @Override
    public int hashCode() {
        return -1093;
    }
    @Override
    public boolean equals(Object obj){
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof App){
                System.out.println("Ref instanceOf Antique");
                ComicBook comicBook1 = this;
                ComicBook comicBook2 = (ComicBook) obj;
                if(comicBook1.title == comicBook2.title ){
                    System.out.println("Both are same");
                    return  true;
                }
            }
        }
        return false;
    }

}
