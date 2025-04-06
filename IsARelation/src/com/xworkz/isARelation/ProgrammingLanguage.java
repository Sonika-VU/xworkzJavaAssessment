package com.xworkz.isARelation;

public class ProgrammingLanguage extends Language{

    public ProgrammingLanguage(){
        super();
        System.out.println("no-arg const of ProgrammingLanguage");
    }

    @Override
    public void communicate(){
//        super.communicate();
        System.out.println("Running communicate in ProgrammingLanguage");
    }

    @Override
    public void read(){
//        super.read();
        System.out.println("Running read in ProgrammingLanguage");
    }

    @Override
    public void write(){
//        super.write();
        System.out.println("Running write in ProgrammingLanguage");
    }

    @Override
    public void translate(){
//        super.translate();
        System.out.println("Running translate in ProgrammingLanguage");
    }

    @Override
    public void storeData(){
//        super.storeData();
        System.out.println("Running storeData in ProgrammingLanguage");
    }
}
