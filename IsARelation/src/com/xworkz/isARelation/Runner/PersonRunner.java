package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Person;
import com.xworkz.isARelation.Student;

public class PersonRunner {
    public static void main(String[] args) {
        Person person = new Person();
        Person person1 = new Student();
        Student student = new Student();

        System.out.println("========================");
        person.eat();
        person.doWork();
        person.eat();
        person.talk();
        person.walk();

        System.out.println("========================");
        person1.eat();
        person1.doWork();
        person1.eat();
        person1.talk();
        person1.walk();

        System.out.println("========================");
        student.eat();
        student.doWork();
        student.eat();
        student.talk();
        student.walk();
    }
}
