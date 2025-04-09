package com.xworkz.ObjectMethodUsage.internal;

public class AppUpdate {
    private String version;
    private String updateDate;
    private boolean isMandatory;

    public AppUpdate(String version, String updateDate, boolean isMandatory) {
        System.out.println("String, String, boolean-arg const of AppUpdate");
        this.version = version;
        this.updateDate = updateDate;
        this.isMandatory = isMandatory;
    }

    @Override
    public String toString() {
        return "AppUpdate{" +
                "version='" + version + '\'' +
                ", updateDate='" + updateDate + '\'' +
                ", isMandatory=" + isMandatory +
                '}';
    }
}
