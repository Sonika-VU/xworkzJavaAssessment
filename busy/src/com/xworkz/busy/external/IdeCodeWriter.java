package com.xworkz.busy.external;

import com.xworkz.busy.internal.rules.CodeFormatter;

public class IdeCodeWriter {
    CodeFormatter codeFormatter;
    public IdeCodeWriter(CodeFormatter codeFormatter){
        this.codeFormatter = codeFormatter;
        System.out.println("codeFormatter-arg const of IdeCodeWriter");
    }

    public void writeCode(){
        System.out.println("Running writeCode in IdeCodeWriter");
        if(this.codeFormatter != null){
            this.codeFormatter.formatCode();
        }
    }
}
