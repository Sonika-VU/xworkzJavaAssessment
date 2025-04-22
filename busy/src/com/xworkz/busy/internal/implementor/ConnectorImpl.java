package com.xworkz.busy.internal.implementor;

import com.xworkz.busy.internal.rules.Connector;

public class ConnectorImpl implements Connector {

    public ConnectorImpl(){
        System.out.println("no-arg const of ConnectorImpl");
    }

    @Override
    public void run() {
        System.out.println("Running run in ConnectorImpl");
    }
}
