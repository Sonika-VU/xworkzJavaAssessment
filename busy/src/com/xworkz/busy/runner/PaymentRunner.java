package com.xworkz.busy.runner;

import com.xworkz.busy.external.PaymentUser;
import com.xworkz.busy.internal.implementor.GPayGateway;
import com.xworkz.busy.internal.rules.PaymentGateway;

public class PaymentRunner {
    public static void main(String[] args) {
        PaymentGateway paymentGateway = new GPayGateway();
        PaymentUser paymentUser = new PaymentUser(paymentGateway);

        paymentUser.sendMoney();
    }
}
