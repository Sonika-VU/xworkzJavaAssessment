package com.xworkz.ObjectMethodUsage.internal;

public class Notebook {
    private int totalPages;
    private String pageType;
    private boolean isSpiralBound;

    public Notebook(int totalPages, String pageType, boolean isSpiralBound) {
        System.out.println("int, String, boolean-arg const of Notebook");
        this.totalPages = totalPages;
        this.pageType = pageType;
        this.isSpiralBound = isSpiralBound;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "totalPages=" + totalPages +
                ", pageType='" + pageType + '\'' +
                ", isSpiralBound=" + isSpiralBound +
                '}';
    }
}
