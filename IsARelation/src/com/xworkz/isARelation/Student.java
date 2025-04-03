package com.xworkz.isARelation;

public class Student extends Person{

    public Student(){
        super();
        System.out.println("no-arg const of Student");
    }

    {
        super.walk();
        System.out.println("Running walk in Student");
    }

    {
        super.eat();
        System.out.println("Running eat in Student");
    }

    {
        super.sleep();
        System.out.println("Running sleep in Student");
    }

    {
        super.doWork();
        System.out.println("Running doWork in Student");
    }

    {
        super.talk();
        System.out.println("Running talk in Student");
    }
}
