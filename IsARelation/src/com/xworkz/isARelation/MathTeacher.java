package com.xworkz.isARelation;

public class MathTeacher extends Teacher {
    public MathTeacher() {
        super();
        System.out.println("no-arg const of MathTeacher");
    }

    {
        super.teach();
        System.out.println("Running teach in MathTeacher");
    }

    {
        super.assignHomework();
        System.out.println("Running assignHomework in MathTeacher");
    }

    {
        super.gradePapers();
        System.out.println("Running gradePapers in MathTeacher");
    }

    {
        super.conductExam();
        System.out.println("Running conductExam in MathTeacher");
    }

    {
        super.attendMeeting();
        System.out.println("Running attendMeeting in MathTeacher");
    }
}
