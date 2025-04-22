package com.xworkz.busy.runner;

import com.xworkz.busy.external.SearchUser;
import com.xworkz.busy.internal.implementor.GoogleSearch;
import com.xworkz.busy.internal.rules.SearchEngine;

public class SearchEngineRunner {
    public static void main(String[] args) {
        SearchEngine searchEngine = new GoogleSearch();
        SearchUser searchUser = new SearchUser(searchEngine);

        searchEngine.search();
    }
}
