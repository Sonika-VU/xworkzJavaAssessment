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

    @Override
    public int hashCode() {
        return -89;
    }

    @Override
    public boolean equals(Object obj){
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof AppUpdate){
                System.out.println("Ref instanceOf AppUpdate");
                AppUpdate appUpdate1 = this;
                AppUpdate appUpdate2 = (AppUpdate) obj;
                if(appUpdate1.version == appUpdate2.version ){
                    System.out.println("Both are same");
                    return  true;
                }
            }
        }
        return false;
    }
}
