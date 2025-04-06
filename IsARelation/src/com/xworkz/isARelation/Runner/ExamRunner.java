package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Exam;
import com.xworkz.isARelation.OnlineExam;

public class ExamRunner {
    public static void main(String[] args) {
        Exam exam = new Exam();
        Exam exam1 = new OnlineExam();
        OnlineExam onlineExam = new OnlineExam();

        System.out.println("============================");
        exam.endExam();
        exam.startExam();
        exam.checkResult();
        exam.reviewQuestions();
        exam.submitAnswer();

        System.out.println("============================");
        exam1.endExam();
        exam1.startExam();
        exam1.checkResult();
        exam1.reviewQuestions();
        exam1.submitAnswer();

        System.out.println("============================");
        onlineExam.endExam();
        onlineExam.startExam();
        onlineExam.checkResult();
        onlineExam.reviewQuestions();
        onlineExam.submitAnswer();
    }
}
