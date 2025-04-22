package com.xworkz.busy.runner;

import com.xworkz.busy.external.TranslatorUser;
import com.xworkz.busy.internal.implementor.EngToKanTranslator;
import com.xworkz.busy.internal.rules.Translator;

public class TranslatorRunner {
    public static void main(String[] args) {
        Translator translator = new EngToKanTranslator();
        TranslatorUser translatorUser = new TranslatorUser(translator);

        translatorUser.learnLang();
    }
}
