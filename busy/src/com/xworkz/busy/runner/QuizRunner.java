package com.xworkz.busy.runner;

import com.xworkz.busy.external.QuizApp;
import com.xworkz.busy.internal.implementor.GKQuestionImpl;
import com.xworkz.busy.internal.rules.QuizGame;

public class QuizRunner {
    public static void main(String[] args) {
        QuizGame quizGame = new GKQuestionImpl();
        QuizApp quizApp = new QuizApp(quizGame);

        quizApp.takeQuiz();
    }
}
