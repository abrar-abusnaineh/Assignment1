package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.assignment1.model.IMovieDa;
import com.example.assignment1.model.Movie;
import com.example.assignment1.model.MovieFactory;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
   private EditText title;
  private   EditText year;
  private   Spinner genre;
private   EditText result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title=findViewById(R.id.movietitletext);
        year=findViewById(R.id.movieyeartext);
        genre=findViewById(R.id.spinner);
        result=findViewById(R.id.searchresulttext);
        populateSpinner();
    }
    private void populateSpinner() {
        MovieFactory factory=new MovieFactory();
        IMovieDa objBook=factory.getModel();
        String [] cats=objBook.getGenre();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,cats);
        //to add values to spinner
        genre.setAdapter(adapter);
    }
    public void btnGetSearchResultOnClick(View view) {
        MovieFactory factory=new MovieFactory();
        IMovieDa objBook=factory.getModel();
String search_title=title.getText().toString();
String searh_year= year.getText().toString();
String search_genre=genre.getSelectedItem().toString();
       List<Movie> data=objBook.searchMovies(search_title,searh_year,search_genre);
        String str="";
        for(Movie b:data){
            str += "Title:"+""+b.getTitle()+","+"Year:"+""+b.getYear()+","+"Genre:"+ ""+b.getGenre()+"\n";
        }
        result.setText(str);

    }
}