package com.example.assignment1.model;

import java.util.ArrayList;

public interface IMovieDa {
    ArrayList<Movie> searchMovies(String title,String year,String genre);
    String[] getGenre();
}
