package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.ActionMovie;
import com.xworkz.isARelation.Movie;

public class MovieRunner {
    public static void main(String[] args) {
        Movie movie = new Movie();
        Movie movie1 = new ActionMovie();
        ActionMovie actionMovie = new ActionMovie();

        System.out.println("==============================");
        movie.act();
        movie.composeSong();
        movie.direct();
        movie.produce();
        movie.telecast();

        System.out.println("==============================");
        movie1.act();
        movie1.composeSong();
        movie1.direct();
        movie1.produce();
        movie1.telecast();

        System.out.println("==============================");
        actionMovie.act();
        actionMovie.composeSong();
        actionMovie.direct();
        actionMovie.produce();
        actionMovie.telecast();

    }
}
