package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Language;
import com.xworkz.isARelation.ProgrammingLanguage;

public class LanguageRunner {
    public static void main(String[] args) {
        Language language = new Language();
        Language language1 = new ProgrammingLanguage();
        ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();

        System.out.println("=====================");
        language.communicate();
        language.read();
        language.storeData();
        language.translate();
        language.write();

        System.out.println("=====================");
        language1.communicate();
        language1.read();
        language1.storeData();
        language1.translate();
        language1.write();

        System.out.println("=====================");
        programmingLanguage.communicate();
        programmingLanguage.read();
        programmingLanguage.storeData();
        programmingLanguage.translate();
        programmingLanguage.write();
    }
}
