package com.example.android.mymusicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class RadioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio2);

        TextView home = (TextView) findViewById(R.id.home);

        //Set a clicklistener on that view
        home.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //create a new intent to open the {@link HomeActivity}
                Intent homeIntent = new Intent(RadioActivity.this, MainActivity.class);
                //start the new activity
                startActivity(homeIntent);
                Toast.makeText(view.getContext(), "Go to Home", Toast.LENGTH_SHORT).show();
            }
        });


        TextView playing = (TextView) findViewById(R.id.playing);

        //Set a clicklistener on that view
        playing.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //create a new intent to open the {@link PlayingActivity}
                Intent playingIntent = new Intent(RadioActivity.this, PlayingActivity.class);
                //start the new activity
                startActivity(playingIntent);
                Toast.makeText(view.getContext(), "Current song", Toast.LENGTH_SHORT).show();
            }
        });

        TextView albums = (TextView) findViewById(R.id.albums);

        albums.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //create a new intent to open the {@link ArtistsActivity}
                Intent albumsIntent = new Intent(RadioActivity.this, AlbumsActivity.class);
                //start the new activity
                startActivity(albumsIntent);
                Toast.makeText(view.getContext(), "Open list of artists", Toast.LENGTH_SHORT).show();
            }
        });

        TextView playlists = (TextView) findViewById(R.id.playlists);

        //Set a clicklistener on that view
        playlists.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //create a new intent to open the {@link PlaylistsActivity}
                Intent playlistsIntent = new Intent(RadioActivity.this, PlaylistsActivity.class);
                //start the new activity
                startActivity(playlistsIntent);
                Toast.makeText(view.getContext(), "Open current playlists", Toast.LENGTH_SHORT).show();
            }
        });

        TextView artists = (TextView) findViewById(R.id.artists);

        artists.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //create a new intent to open the {@link ArtistsActivity}
                Intent artistsIntent = new Intent(RadioActivity.this, ArtistsActivity.class);
                //start the new activity
                startActivity(artistsIntent);
                Toast.makeText(view.getContext(), "Open list of artists", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
