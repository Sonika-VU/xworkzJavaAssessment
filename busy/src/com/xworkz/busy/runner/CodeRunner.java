package com.xworkz.busy.runner;

import com.xworkz.busy.external.IdeCodeWriter;
import com.xworkz.busy.internal.implementor.JavaCodeFormatterImpl;
import com.xworkz.busy.internal.rules.CodeFormatter;

public class CodeRunner {
    public static void main(String[] args) {
        CodeFormatter codeFormatter = new JavaCodeFormatterImpl();
        IdeCodeWriter ideCodeWriter = new IdeCodeWriter(codeFormatter);

        ideCodeWriter.writeCode();
    }
}
