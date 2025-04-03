package com.xworkz.isARelation;

public class NoticeBoard extends Poster{

    public NoticeBoard(){
        super();
        System.out.println("no-arg const of NoticeBoard");
    }

    {
        super.write();
        System.out.println("Running write in NoticeBoard");
    }

    {
        super.display();
        System.out.println("Running display in NoticeBoard");
    }

    {
        super.print();
        System.out.println("Running print in NoticeBoard");
    }

    {
        super.stick();
        System.out.println("Running stick in NoticeBoard");
    }

    {
        super.share();
        System.out.println("Running share in NoticeBoard");
    }
}
