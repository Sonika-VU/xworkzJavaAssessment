package com.xworkz.busy.external;

import com.xworkz.busy.internal.rules.PdfGenerator;

public class PdfGeneratorApp {
    PdfGenerator pdfGenerator;

    public PdfGeneratorApp(PdfGenerator pdfGenerator){
        this.pdfGenerator = pdfGenerator;
        System.out.println("pdfGenerator-arg const of PdfGeneratorApp");
    }

    public void useApp(){
        System.out.println("Running useApp in PdfGeneratorApp");
        if(this.pdfGenerator != null){
            this.pdfGenerator.generate();
        }
    }
}
