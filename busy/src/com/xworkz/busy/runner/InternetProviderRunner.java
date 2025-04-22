package com.xworkz.busy.runner;

import com.xworkz.busy.external.InternetUser;
import com.xworkz.busy.internal.implementor.AirtelInternetProvider;
import com.xworkz.busy.internal.rules.InternetProvider;

public class InternetProviderRunner {
    public static void main(String[] args) {
        InternetProvider internetProvider = new AirtelInternetProvider();
        InternetUser internetUser = new InternetUser(internetProvider);

        internetUser.useInternet();
    }
}
