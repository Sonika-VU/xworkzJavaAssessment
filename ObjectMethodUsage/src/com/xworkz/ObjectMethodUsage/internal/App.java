package com.xworkz.ObjectMethodUsage.internal;

public class App {
    private String appName;
    private String developer;
    private double version;

    public App(String appName, String developer, double version) {
        System.out.println("String, String, double-arg const of App");
        this.appName = appName;
        this.developer = developer;
        this.version = version;
    }

    @Override
    public String toString() {
        return "App{" +
                "appName='" + appName + '\'' +
                ", developer='" + developer + '\'' +
                ", version=" + version +
                '}';
    }
}
