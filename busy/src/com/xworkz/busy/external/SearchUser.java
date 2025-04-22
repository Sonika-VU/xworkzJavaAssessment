package com.xworkz.busy.external;

import com.xworkz.busy.internal.rules.SearchEngine;

public class SearchUser {

    SearchEngine searchEngine;

    public SearchUser(SearchEngine searchEngine){
        this.searchEngine = searchEngine;
        System.out.println("searchEngine-arg const of SearchUser");
    }

    public void provideDetails(){
        System.out.println("Running provideDetails in SearchUser");
        if(this.searchEngine != null){
            this.searchEngine.search();
        }
    }
}
