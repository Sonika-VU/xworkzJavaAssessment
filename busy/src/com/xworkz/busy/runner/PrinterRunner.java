package com.xworkz.busy.runner;

import com.xworkz.busy.external.PrinterUser;
import com.xworkz.busy.internal.implementor.CanonPrinterImpl;
import com.xworkz.busy.internal.rules.PrinterService;

public class PrinterRunner {
    public static void main(String[] args) {
        PrinterService printerService = new CanonPrinterImpl();
        PrinterUser printerUser = new PrinterUser(printerService);

        printerUser.printPapers();
    }
}
