package com.example.assignment1.model;

import java.util.ArrayList;

class MovieDa implements IMovieDa {
    private ArrayList<Movie> movie=new ArrayList<>();
    //creating small database for testing
    public MovieDa(){
        movie.add(new Movie("Life in 2 days","2010","comedy"));
       movie.add(new Movie("One Hour","2012","horror"));
        movie.add(new Movie("Last day","2015","drama"));
        movie.add(new Movie("Hello","2012","drama"));
    }
public ArrayList searchMovies(String title,String year,String genre){
    ArrayList<Movie>data=new ArrayList<>();
    for(Movie b:movie){
            if(b.getTitle().equalsIgnoreCase(title) || b.getTitle().matches(title) || b.getTitle().contains(title)||(title == null || title.isEmpty() && title.equals("null")))
                if(b.getYear().equals(year)|| (year == null || year.isEmpty() || year.equals("null")))
                    if(b.getGenre().equals(genre)|| (genre == null || genre.isEmpty() || genre.equals("null")))
                data.add(b);
    }
    return data;
}
    @Override
    public String[] getGenre() {
        String[] genre= new String[]{"","horror","comedy","drama"};
        return genre;
    }
}
