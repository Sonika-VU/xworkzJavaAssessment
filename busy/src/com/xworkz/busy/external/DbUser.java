package com.xworkz.busy.external;

import com.xworkz.busy.internal.rules.DatabaseConnector;

public class DbUser {
    DatabaseConnector databaseConnector;

    public DbUser(DatabaseConnector databaseConnector){
        this.databaseConnector = databaseConnector;
        System.out.println("databaseConnector-arg const of DbUser");
    }

    public void setData(){
        System.out.println("Running setDate in DbUser");
        if(this.databaseConnector != null){
            this.databaseConnector.connect();
        }
    }
}
