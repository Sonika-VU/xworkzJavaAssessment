package com.xworkz.busy.runner;

import com.xworkz.busy.external.LoggingApp;
import com.xworkz.busy.internal.implementor.FileLoggerImpl;
import com.xworkz.busy.internal.rules.Logger;

public class LoggerRunner {
    public static void main(String[] args) {
        Logger logger = new FileLoggerImpl();
        LoggingApp loggingApp = new LoggingApp(logger);

        loggingApp.run();
    }
}
