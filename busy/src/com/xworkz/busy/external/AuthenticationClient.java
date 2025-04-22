package com.xworkz.busy.external;

import com.xworkz.busy.internal.rules.AuthenticationService;

public class AuthenticationClient {
    AuthenticationService authenticationService;

    public AuthenticationClient(AuthenticationService authenticationService){
        this.authenticationService = authenticationService;
        System.out.println("authenticationService-arg const of AuthenticationClient ");
    }

    public void enterDetails(){
        System.out.println("Running enterDetails in AuthenticationClient");
        if(this.authenticationService != null){
            this.authenticationService.login();
        }
    }
}
