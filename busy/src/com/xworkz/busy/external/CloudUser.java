package com.xworkz.busy.external;

import com.xworkz.busy.internal.rules.CloudStorage;

public class CloudUser {
    CloudStorage cloudStorage ;

    public CloudUser(CloudStorage cloudStorage){
        this.cloudStorage = cloudStorage;
        System.out.println("cloudStorage-arg const of CloudUser");
    }

    public void store(){
        System.out.println("Running store in CloudUser");
        if(this.cloudStorage != null){
            cloudStorage.uploadFile();
        }
    }
}
