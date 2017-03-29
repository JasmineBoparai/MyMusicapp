package com.example.android.mymusicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView nowPlaying = (TextView) findViewById(R.id.nowplaying);

        //Set a clicklistener on that view
        nowPlaying.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //create a new intent to open the {@link NowplayingActivity}
                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                //start the new activity
                startActivity(nowPlayingIntent);
                Toast.makeText(view.getContext(), "Open music", Toast.LENGTH_SHORT).show();
            }
        });

        TextView artists = (TextView) findViewById(R.id.artists);

        artists.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //create a new intent to open the {@link ArtistsActivity}
                Intent artistsIntent = new Intent(MainActivity.this, ArtistsActivity.class);
                //start the new activity
                startActivity(artistsIntent);
                Toast.makeText(view.getContext(), "Open list of artists", Toast.LENGTH_SHORT).show();
            }
        });

        TextView albums = (TextView) findViewById(R.id.albums);

        //Set a clicklistener on that view
        albums.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //create a new intent to open the {@link AlbumsActivity}
                Intent albumsIntent = new Intent(MainActivity.this, AlbumsActivity.class);
                //start the new activity
                startActivity(albumsIntent);
                Toast.makeText(view.getContext(), "Open list of albums", Toast.LENGTH_SHORT).show();
            }
        });

        TextView playlists = (TextView) findViewById(R.id.playlists);

        //Set a clicklistener on that view
        playlists.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //create a new intent to open the {@link PlaylistsActivity}
                Intent playlistsIntent = new Intent(MainActivity.this, PlaylistsActivity.class);
                //start the new activity
                startActivity(playlistsIntent);
                Toast.makeText(view.getContext(), "Open playlists", Toast.LENGTH_SHORT).show();
            }
        });

        TextView podcasts = (TextView) findViewById(R.id.podcasts);

        //Set a clicklistener on that view
        podcasts.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //create a new intent to open the {@link PodcastsActivity}
                Intent podcastsIntent = new Intent(MainActivity.this, PodcastsActivity.class);
                //start the new activity
                startActivity(podcastsIntent);
                Toast.makeText(view.getContext(), "Open list of Podcasts", Toast.LENGTH_SHORT).show();
            }
        });


















    }
}
