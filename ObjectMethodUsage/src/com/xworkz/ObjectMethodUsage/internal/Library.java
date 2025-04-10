package com.xworkz.ObjectMethodUsage.internal;

public class Library {
    private String name;
    private int totalBooks;
    private boolean isPublic;

    public Library(String name, int totalBooks, boolean isPublic) {
        System.out.println("String, int, boolean-arg const of Library");
        this.name = name;
        this.totalBooks = totalBooks;
        this.isPublic = isPublic;
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", totalBooks=" + totalBooks +
                ", isPublic=" + isPublic +
                '}';
    }

    @Override
    public int hashCode() {
        return 785;
    }
}
