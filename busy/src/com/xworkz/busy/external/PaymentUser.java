package com.xworkz.busy.external;

import com.xworkz.busy.internal.rules.PaymentGateway;

public class PaymentUser {
    PaymentGateway paymentGateway;

    public PaymentUser(PaymentGateway paymentGateway){
        this.paymentGateway = paymentGateway;
        System.out.println("paymentGateway-arg const of PaymentUser");
    }

    public void sendMoney(){
        System.out.println("Running sendMoney in PaymentUser");
        if(this.paymentGateway != null){
            this.paymentGateway.processPayment();
        }
    }
}
