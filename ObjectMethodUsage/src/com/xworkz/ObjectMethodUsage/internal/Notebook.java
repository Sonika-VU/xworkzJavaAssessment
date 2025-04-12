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

    @Override
    public int hashCode() {
        return 43;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Notebook) {
                System.out.println("Ref instanceOf Notebook");
                Notebook notebook1 = this;
                Notebook  notebook2 = (Notebook) obj;
                if (notebook1.totalPages == notebook2.totalPages && notebook1.isSpiralBound == notebook2.isSpiralBound) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
