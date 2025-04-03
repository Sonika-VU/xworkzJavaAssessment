package com.xworkz.isARelation;

public class OnlineExam extends Exam {
    public OnlineExam() {
        super();
        System.out.println("no-arg constructor of OnlineExam");
    }

    {
        super.startExam();
        System.out.println("Starting Online Exam through web portal");
    }

    {
        super.submitAnswer();
        System.out.println("Submitting answer digitally in Online Exam");
    }

    {
        super.checkResult();
        System.out.println("Checking Online Exam result on website");
    }

    {
        super.reviewQuestions();
        System.out.println("Reviewing Online Exam questions digitally");
    }

    {
        super.endExam();
        System.out.println("Ending Online Exam automatically after time limit");
    }
}
