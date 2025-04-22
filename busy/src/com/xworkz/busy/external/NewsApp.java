package com.xworkz.busy.external;

import com.xworkz.busy.internal.rules.NewsService;

public class NewsApp {
    NewsService newsService;

    public NewsApp(NewsService newsService){
        this.newsService = newsService;
        System.out.println("newsService-arg const of NewsApp");
    }

    public void display(){
        System.out.println("Running display in NewsApp");
        if(this.newsService != null){
            this.newsService.fetchHeadLines();
        }
    }
}
