package com.example.assignment1.model;

public class Movie {
    private String title;
    private String year;
    private String genre;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Movie(String title, String year, String genre) {
        this.title = title;
        this.year = year;
        this.genre = genre;
    }



}
