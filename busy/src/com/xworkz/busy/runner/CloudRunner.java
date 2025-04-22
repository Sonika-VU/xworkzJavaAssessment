package com.xworkz.busy.runner;

import com.xworkz.busy.external.CloudUser;
import com.xworkz.busy.internal.implementor.CloudStorageImpl;
import com.xworkz.busy.internal.rules.CloudStorage;

public class CloudRunner {
    public static void main(String[] args) {
        CloudStorage cloudStorage = new CloudStorageImpl();
        CloudUser cloudUser = new CloudUser(cloudStorage);

        cloudUser.store();
    }
}
