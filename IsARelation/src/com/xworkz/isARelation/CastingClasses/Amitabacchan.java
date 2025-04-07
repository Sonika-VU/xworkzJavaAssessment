package com.xworkz.isARelation.CastingClasses;

import com.xworkz.isARelation.ActionMovie;
import com.xworkz.isARelation.Movie;

public class Amitabacchan {

    public void act(Movie movie){
        movie.act();
        movie.composeSong();
        movie.direct();
        movie.produce();
        movie.telecast();

        if(movie instanceof ActionMovie){
            ActionMovie actionMovie = (ActionMovie) movie;
            actionMovie.addFight();
        }
    }
}
