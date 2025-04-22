package com.xworkz.busy.external;

import com.xworkz.busy.internal.rules.Logger;

public class LoggingApp {
    Logger logger ;

    public LoggingApp(Logger logger){
        this.logger = logger;
        System.out.println("logger-arg const of LoggingApp");
    }

    public void run(){
        System.out.println("Running run in LoggingApp");
        if(this.logger != null){
            this.logger.log();
        }
    }
}
