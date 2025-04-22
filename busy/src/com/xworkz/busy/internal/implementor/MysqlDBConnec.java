package com.xworkz.busy.internal.implementor;

import com.xworkz.busy.internal.rules.DatabaseConnector;

public class MysqlDBConnec implements DatabaseConnector {

    public MysqlDBConnec(){
        System.out.println("no-arg cosnt of MysqlDBConnec");
    }

    @Override
    public void connect() {
        System.out.println("Running connect in MysqlDBConnec");
    }
}
