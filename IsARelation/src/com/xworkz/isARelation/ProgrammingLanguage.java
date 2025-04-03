package com.xworkz.isARelation;

public class ProgrammingLanguage extends Language{

    public ProgrammingLanguage(){
        super();
        System.out.println("no-arg const of ProgrammingLanguage");
    }

    {
        super.communicate();
        System.out.println("Running communicate in ProgrammingLanguage");
    }

    {
        super.read();
        System.out.println("Running read in ProgrammingLanguage");
    }

    {
        super.write();
        System.out.println("Running write in ProgrammingLanguage");
    }

    {
        super.translate();
        System.out.println("Running translate in ProgrammingLanguage");
    }

    {
        super.storeData();
        System.out.println("Running storeData in ProgrammingLanguage");
    }
}
