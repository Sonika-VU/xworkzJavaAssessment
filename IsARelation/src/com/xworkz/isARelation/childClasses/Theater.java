package com.xworkz.isARelation.childClasses;

import com.xworkz.isARelation.parentClasses.Movie;

public class Theater extends Movie {
    @Override
    public void display() {
        System.out.println("Running display in Theater");
    }
}
