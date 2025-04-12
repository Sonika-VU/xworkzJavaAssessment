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

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Library) {
                System.out.println("Ref instanceOf Library");
                Library library1 = this;
                Library  library2 = (Library) obj;
                if (library1.name == library2.name && library2.isPublic == library2.isPublic) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
