package com.xworkz.busy.internal.implementor;

import com.xworkz.busy.internal.rules.DeliveryService;

public class AmazonDeliveryImpl implements DeliveryService {
    public AmazonDeliveryImpl (){
        System.out.println("no-arg const of AmazonDeliveryImpl");
    }
    @Override
    public void deliver() {
        System.out.println("Running deliver in AmazonDeliveryImpl");
    }
}
