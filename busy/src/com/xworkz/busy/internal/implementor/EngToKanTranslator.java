package com.xworkz.busy.internal.implementor;

import com.xworkz.busy.internal.rules.Translator;

public class EngToKanTranslator implements Translator {
    public EngToKanTranslator (){
        System.out.println("no-arg const of EngToKanTranslator");
    }

    @Override
    public void translate() {
        System.out.println("Running translate in EngToKanTranslator");
    }
}
