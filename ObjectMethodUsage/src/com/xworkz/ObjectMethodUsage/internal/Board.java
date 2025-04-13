package com.xworkz.ObjectMethodUsage.internal;

public class Board {
    private String color;
    private int height;
    private  int width;

    public Board(String color, int height, int width){
        System.out.println("String, int, int -arg const of Board");
        this.color = color;
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Board{" +
                "color='" + color + '\'' +
                ", height=" + height +
                ", width=" + width +
                '}';
    }

    @Override
    public int hashCode() {
        return -12;
    }

    @Override
    public boolean equals(Object obj){
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Board){
                System.out.println("Ref instanceOf Board");
                Board board1 = this;
                Board board2 = (Board) obj;
                if(board1.color == board2.color ){
                    System.out.println("Both are same");
                    return  true;
                }
            }
        }
        return false;
    }
}
