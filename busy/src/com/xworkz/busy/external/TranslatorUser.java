package com.xworkz.busy.external;

import com.xworkz.busy.internal.rules.Translator;

public class TranslatorUser {
    Translator translator ;

    public TranslatorUser(Translator translator){
        this.translator = translator;
        System.out.println("translator-arg const of TranslatorUser");
    }

    public void learnLang(){
        System.out.println("Running learnLang of TranslatorUser");
        if(this.translator != null){
            this.translator.translate();
        }
    }
}
