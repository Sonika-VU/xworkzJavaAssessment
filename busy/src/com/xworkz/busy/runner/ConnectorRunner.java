package com.xworkz.busy.runner;

import com.xworkz.busy.external.ConnectorUser;
import com.xworkz.busy.internal.rules.Connector;
import com.xworkz.busy.internal.implementor.ConnectorImpl;

public class ConnectorRunner {
    public static void main(String[] args) {
        Connector connector = new ConnectorImpl();

        ConnectorUser connectorUser = new ConnectorUser(connector);
        connectorUser.execute();
    }
}
