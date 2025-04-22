package com.xworkz.busy.internal.implementor;

import com.xworkz.busy.internal.rules.QuizGame;

public class GKQuestionImpl implements QuizGame {

    public GKQuestionImpl(){
        System.out.println("no-arg const of GKQuestionImpl");
    }

    @Override
    public void askQuestion() {
        System.out.println("Running askQuestion in GKQuestionImpl");
    }
}
