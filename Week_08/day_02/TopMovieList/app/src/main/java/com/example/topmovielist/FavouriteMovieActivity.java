package com.example.topmovielist;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;

public class FavouriteMovieActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourite_movie);


//        get movie to favourite
        Intent intent = getIntent();
        Movie movie = (Movie) intent.getSerializableExtra("movieToAdd");
        Log.d("Movie in FavActivity", movie.toString());

//        Getting saved movies JSON
        SharedPreferences sharedPrefs = getSharedPreferences("movie_list", Context.MODE_PRIVATE);
        String favouritesJson = sharedPrefs.getString("favourites", new ArrayList<Movie>().toString() );
        Log.d("saved favourites", favouritesJson);

//        Converting JSON Array into ArrayList<Movie>
        Gson gson = new Gson();

        TypeToken< ArrayList<Movie> > moviesArrayTypeToken = new TypeToken<ArrayList<Movie>>(){};
        ArrayList<Movie> favourites = gson.fromJson(favouritesJson, moviesArrayTypeToken.getType() );

        favourites.add(movie);

        Log.d("updated favourites", favourites.toString() );

// Update the view
        TextView favouritesList = (TextView) findViewById(R.id.favouritesList);

        String moviesList = "";

        for (Movie currentMovie : favourites) {

            moviesList += currentMovie.getTitle() + " - " + currentMovie.getYear() + "\n";
        }

        favouritesList.setText(moviesList);

// Save favourite movies to SharedPreferences

        sharedPrefs.edit()
                .putString("favourites", gson.toJson(favourites))
                .apply();






    }
}
