package com.xworkz.busy.internal.implementor;

import com.xworkz.busy.internal.rules.PrinterService;

public class CanonPrinterImpl implements PrinterService {

    public CanonPrinterImpl(){
        System.out.println("no-arg const of CanonPrinterImpl");
    }

    @Override
    public void printDocs() {
        System.out.println("Running printDocs in CanonPrinterImpl");
    }
}
