package com.xworkz.AccessSpecifier.internal;

public class BoardTeacher {
    Board board = new Board();

    public void teach(){
        System.out.println(board.color);
        System.out.println(board.price);
        board.watchMovie();
        board.write();
    }
}
