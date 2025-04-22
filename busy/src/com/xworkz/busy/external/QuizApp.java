package com.xworkz.busy.external;

import com.xworkz.busy.internal.rules.QuizGame;

public class QuizApp {

    QuizGame quizGame;

    public QuizApp(QuizGame quizGame){
        this.quizGame = quizGame;
        System.out.println("quizGame-arg const of QuizApp");
    }

    public void takeQuiz(){
        System.out.println("Running takeQuiz in QuizApp");
        if(this.quizGame != null){
            this.quizGame.askQuestion();
        }
    }
}
