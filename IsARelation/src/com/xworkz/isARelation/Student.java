package com.xworkz.isARelation;

public class Student extends Person{

    public Student(){
        super();
        System.out.println("no-arg const of Student");
    }

    @Override
    public void walk(){
//        super.walk();
        System.out.println("Running walk in Student");
    }

    @Override
    public void eat(){
//        super.eat();
        System.out.println("Running eat in Student");
    }

    @Override
    public void sleep(){
//        super.sleep();
        System.out.println("Running sleep in Student");
    }

    @Override
    public void doWork(){
//        super.doWork();
        System.out.println("Running doWork in Student");
    }

    @Override
    public void talk(){
//        super.talk();
        System.out.println("Running talk in Student");
    }
}
