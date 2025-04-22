package com.xworkz.busy.runner;

import com.xworkz.busy.external.DbUser;
import com.xworkz.busy.internal.implementor.MysqlDBConnec;
import com.xworkz.busy.internal.rules.DatabaseConnector;

public class DatabaseRunner {
    public static void main(String[] args) {
        DatabaseConnector databaseConnector = new MysqlDBConnec();
        DbUser dbUser = new DbUser(databaseConnector);

        dbUser.setData();
    }
}
