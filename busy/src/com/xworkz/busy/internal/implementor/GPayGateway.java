package com.xworkz.busy.internal.implementor;

import com.xworkz.busy.internal.rules.PaymentGateway;

public class GPayGateway implements PaymentGateway {
    public GPayGateway(){
        System.out.println("no-arg cosnt of GPayGateway");
    }

    @Override
    public void processPayment() {
        System.out.println("Running processPayment in GPayGateway");
    }
}
