package com.xworkz.isARelation;

public class NoticeBoard extends Poster{

    public NoticeBoard(){
        super();
        System.out.println("no-arg const of NoticeBoard");
    }

    @Override
    public void write(){
//        super.write();
        System.out.println("Running write in NoticeBoard");
    }

    @Override
    public void display(){
//        super.display();
        System.out.println("Running display in NoticeBoard");
    }

    @Override
    public void print(){
//        super.print();
        System.out.println("Running print in NoticeBoard");
    }

    @Override
    public void stick(){
//        super.stick();
        System.out.println("Running stick in NoticeBoard");
    }

    @Override
    public void share(){
//        super.share();
        System.out.println("Running share in NoticeBoard");
    }

    public void addMessage(){
        System.out.println("Running addMessage in NoticeBoard");
    }
}
