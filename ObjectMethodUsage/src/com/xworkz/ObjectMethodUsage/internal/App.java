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

    @Override
    public int hashCode() {
        System.out.println("Default value : "+super.hashCode());
        return 21;
    }

    @Override
    public boolean equals(Object obj){
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof App){
                System.out.println("Ref instanceOf Antique");
                App app1 = this;
                App app2 = (App) obj;
                if(app1.appName == app2.appName ){
                    System.out.println("Both are same");
                    return  true;
                }
            }
        }
        return false;
    }
}
