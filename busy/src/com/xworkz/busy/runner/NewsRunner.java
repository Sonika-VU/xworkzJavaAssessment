package com.xworkz.busy.runner;

import com.xworkz.busy.external.NewsApp;
import com.xworkz.busy.internal.implementor.DeccanNewsImpl;
import com.xworkz.busy.internal.rules.NewsService;

public class NewsRunner {
    public static void main(String[] args) {
        NewsService newsService = new DeccanNewsImpl();
        NewsApp newsApp = new NewsApp(newsService);

        newsApp.display();
    }
}
