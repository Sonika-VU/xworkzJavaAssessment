package com.xworkz.busy.internal.implementor;

import com.xworkz.busy.internal.rules.PdfGenerator;

public class ReportPdfImpl implements PdfGenerator {
    public ReportPdfImpl(){
        System.out.println("no-arg const of ReportPdfImpl");
    }

    @Override
    public void generate() {
        System.out.println("no-arg const of ReportPdfImpl");
    }


}
