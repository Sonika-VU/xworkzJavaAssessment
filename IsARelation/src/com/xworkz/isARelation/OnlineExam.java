package com.xworkz.isARelation;

public class OnlineExam extends Exam {
    public OnlineExam() {
        super();
        System.out.println("no-arg constructor of OnlineExam");
    }

    @Override
    public void startExam(){
//        super.startExam();
        System.out.println("Starting Online Exam through web portal");
    }

    @Override
    public void submitAnswer(){
//        super.submitAnswer();
        System.out.println("Submitting answer digitally in Online Exam");
    }

    @Override
    public void checkResult(){
//        super.checkResult();
        System.out.println("Checking Online Exam result on website");
    }

    @Override
    public void reviewQuestions(){
//        super.reviewQuestions();
        System.out.println("Reviewing Online Exam questions digitally");
    }

    @Override
    public void endExam(){
//        super.endExam();
        System.out.println("Ending Online Exam automatically after time limit");
    }

    public void setWebsite(){
        System.out.println("Running setWebsite in OnlineExam");
    }
}
