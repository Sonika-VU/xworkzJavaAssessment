package com.xworkz.busy.internal.implementor;

import com.xworkz.busy.internal.rules.CodeFormatter;

public class JavaCodeFormatterImpl implements CodeFormatter {
    public JavaCodeFormatterImpl(){
        System.out.println("no-arg const of JavaCodeFormatterImpl");
    }
    @Override
    public void formatCode() {
        System.out.println("Running formatCode in JavaCodeFormatterImpl");
    }
}
