package com.xworkz.isARelation.CastingClasses;

import com.xworkz.isARelation.Exam;
import com.xworkz.isARelation.OnlineExam;

public class CovidStudent {

    public void writeExam(Exam exam){
        exam.endExam();
        exam.startExam();
        exam.checkResult();
        exam.reviewQuestions();
        exam.submitAnswer();

        if(exam instanceof OnlineExam){
            OnlineExam onlineExam = (OnlineExam) exam;
            onlineExam.setWebsite();
        }
    }
}
