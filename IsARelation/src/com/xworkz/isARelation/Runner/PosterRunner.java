package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.NoticeBoard;
import com.xworkz.isARelation.Poster;

public class PosterRunner {
    public static void main(String[] args) {
        Poster poster = new Poster();
        Poster poster1 = new NoticeBoard();
        NoticeBoard noticeBoard = new NoticeBoard();

        System.out.println("============================");
        poster.display();
        poster.print();
        poster.share();
        poster.stick();
        poster.write();

        System.out.println("============================");
        poster1.display();
        poster1.print();
        poster1.share();
        poster1.stick();
        poster1.write();

        System.out.println("============================");
        noticeBoard.display();
        noticeBoard.print();
        noticeBoard.share();
        noticeBoard.stick();
        noticeBoard.write();
    }
}
