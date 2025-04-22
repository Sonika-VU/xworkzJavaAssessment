package com.xworkz.busy.internal.implementor;

import com.xworkz.busy.internal.rules.Logger;

public class FileLoggerImpl implements Logger {
    public FileLoggerImpl(){
        System.out.println("no-arg const of FileLoggerImpl");
    }
    @Override
    public void log() {
        System.out.println("Running log in FileLoggerImpl");
    }
}
