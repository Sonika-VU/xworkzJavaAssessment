package com.xworkz.busy.internal.implementor;

import com.xworkz.busy.internal.rules.SearchEngine;

public class GoogleSearch implements SearchEngine {
    public GoogleSearch(){
        System.out.println("no-arg const of GoogleSearch");
    }
    @Override
    public void search() {
        System.out.println("Running search in GoogleSearch");
    }
}
