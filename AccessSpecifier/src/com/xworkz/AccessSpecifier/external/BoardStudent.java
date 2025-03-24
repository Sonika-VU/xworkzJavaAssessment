package com.xworkz.AccessSpecifier.external;

import com.xworkz.AccessSpecifier.internal.Board;

public class BoardStudent {

    Board board = new Board();

    public void listen(){
        System.out.println(board.color);
        board.write();
    }
}
