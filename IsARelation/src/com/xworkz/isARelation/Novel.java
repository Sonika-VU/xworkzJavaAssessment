package com.xworkz.isARelation;

public class Novel extends Book{

    public Novel(){
        super();
        System.out.println("no-arg const of Novel");
    }

    @Override
    public void write(){
//        super.write();
        System.out.println("Running write in Novel");
    }

    @Override
    public void read(){
//        super.read();
        System.out.println("Running read in Novel");
    }

    @Override
    public void giftIt(){
//        super.giftIt();
        System.out.println("Running giftIt in Novel");
    }

    @Override
    public void print(){
//        super.print();
        System.out.println("Running print in Novel");
    }

    @Override
    public void wrap(){
//        super.wrap();
        System.out.println("Running wrap in Book");
    }

    public void makeStory(){
        System.out.println("Running makeStory in Novel");
    }
}
