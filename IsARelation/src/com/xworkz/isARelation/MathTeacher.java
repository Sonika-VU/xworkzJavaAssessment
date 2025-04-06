package com.xworkz.isARelation;

public class MathTeacher extends Teacher {
    public MathTeacher() {
        super();
        System.out.println("no-arg const of MathTeacher");
    }

    @Override
    public void teach(){
//        super.teach();
        System.out.println("Running teach in MathTeacher");
    }

    @Override
    public void assignHomework(){
//        super.assignHomework();
        System.out.println("Running assignHomework in MathTeacher");
    }

    @Override
    public void gradePapers(){
//        super.gradePapers();
        System.out.println("Running gradePapers in MathTeacher");
    }

    @Override
    public void conductExam(){
//        super.conductExam();
        System.out.println("Running conductExam in MathTeacher");
    }

    @Override
    public void attendMeeting(){
//        super.attendMeeting();
        System.out.println("Running attendMeeting in MathTeacher");
    }
}
