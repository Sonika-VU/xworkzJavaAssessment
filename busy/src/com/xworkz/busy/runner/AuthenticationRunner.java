package com.xworkz.busy.runner;

import com.xworkz.busy.external.AuthenticationClient;
import com.xworkz.busy.internal.implementor.GoogleAuthService;
import com.xworkz.busy.internal.rules.AuthenticationService;

public class AuthenticationRunner {
    public static void main(String[] args) {
        AuthenticationService authenticationService = new GoogleAuthService();
        AuthenticationClient authenticationClient = new AuthenticationClient(authenticationService);

        authenticationClient.enterDetails();
    }
}
