package com.xworkz.busy.runner;

import com.xworkz.busy.external.DeliverStation;
import com.xworkz.busy.internal.implementor.AmazonDeliveryImpl;
import com.xworkz.busy.internal.rules.DeliveryService;

public class DeliverServiceRunner {
    public static void main(String[] args) {
        DeliveryService deliveryService = new AmazonDeliveryImpl();
        DeliverStation deliverStation = new DeliverStation(deliveryService);

        deliverStation.sendParcel();
    }
}
