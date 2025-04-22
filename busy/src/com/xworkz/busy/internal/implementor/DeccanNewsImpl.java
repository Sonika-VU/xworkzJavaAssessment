package com.xworkz.busy.internal.implementor;

import com.xworkz.busy.internal.rules.NewsService;

public class DeccanNewsImpl  implements NewsService {
    public DeccanNewsImpl(){
        System.out.println("no-arg const of DeccanNewsImpl");
    }
    @Override
    public void fetchHeadLines() {
        System.out.println("Running fetchHeadLines in DeccanNewsImpl");
    }
}
