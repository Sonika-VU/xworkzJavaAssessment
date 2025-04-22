package com.xworkz.busy.external;

import com.xworkz.busy.internal.rules.PrinterService;

public class PrinterUser {
    PrinterService printerService;

    public PrinterUser(PrinterService printerService){
        this.printerService = printerService;
        System.out.println("printerService-arg const of PrinterUser");
    }

    public void printPapers(){
        System.out.println("Running printPapers in PrinterUser");
        if(this.printerService != null){
            this.printerService.printDocs();
        }
    }
}
