package com.xworkz.busy.external;

import com.xworkz.busy.internal.rules.Connector;

public class ConnectorUser {
    Connector connector;

    public ConnectorUser(Connector connector){
        this.connector = connector;
        System.out.println("connector-arg const of ConnectorUser");
    }

    public void execute(){
        System.out.println("Running execute in ConnectorUser");

        if(this.connector != null){
            this.connector.run();
        }
    }

}
