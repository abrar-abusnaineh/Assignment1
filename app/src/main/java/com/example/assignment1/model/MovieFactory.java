package com.example.assignment1.model;

public class MovieFactory {
    public IMovieDa getModel(){
        return  new MovieDa();}
}
