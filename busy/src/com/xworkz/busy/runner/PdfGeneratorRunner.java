package com.xworkz.busy.runner;

import com.xworkz.busy.external.PdfGeneratorApp;
import com.xworkz.busy.internal.implementor.ReportPdfImpl;
import com.xworkz.busy.internal.rules.PdfGenerator;

public class PdfGeneratorRunner {
    public static void main(String[] args) {
        PdfGenerator pdfGenerator = new ReportPdfImpl();
        PdfGeneratorApp pdfGeneratorApp = new PdfGeneratorApp(pdfGenerator);

        pdfGeneratorApp.useApp();
    }
}
