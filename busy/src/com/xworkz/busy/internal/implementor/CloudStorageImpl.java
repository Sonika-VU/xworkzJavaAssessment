package com.xworkz.busy.internal.implementor;

import com.xworkz.busy.internal.rules.CloudStorage;

public class CloudStorageImpl implements CloudStorage {
    public CloudStorageImpl(){
        System.out.println("no-arg const of CloudStorageImpl");
    }
    @Override
    public void uploadFile() {
        System.out.println("Running uploadFile in CloudStorageImpl");
    }
}
