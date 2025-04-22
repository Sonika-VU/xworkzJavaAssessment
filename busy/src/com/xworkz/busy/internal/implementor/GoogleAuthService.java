package com.xworkz.busy.internal.implementor;

import com.xworkz.busy.internal.rules.AuthenticationService;

public class GoogleAuthService implements AuthenticationService {
    public GoogleAuthService(){
        System.out.println("no-arg const of GoogleAuthService");
    }
    @Override
    public void login() {
        System.out.println("Running login in GoogleAuthService");
    }
}
