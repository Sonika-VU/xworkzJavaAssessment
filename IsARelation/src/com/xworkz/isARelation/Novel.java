package com.xworkz.isARelation;

public class Novel extends Book{

    public Novel(){
        super();
        System.out.println("no-arg const of Novel");
    }

    {
        super.write();
        System.out.println("Running write in Novel");
    }

    {
        super.read();
        System.out.println("Running read in Novel");
    }
    {
        super.giftIt();
        System.out.println("Running giftIt in Novel");
    }

    {
        super.print();
        System.out.println("Running print in Novel");
    }

    {
        super.wrap();
        System.out.println("Running wrap in Book");
    }
}
