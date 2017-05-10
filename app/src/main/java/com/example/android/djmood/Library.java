package com.example.android.djmood;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Library extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        setTitle(R.string.navigation_library);

        findViewById(R.id.navigate_shuffle).setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent shuffleIntent = new Intent(Library.this, Shuffle.class);
                startActivity(shuffleIntent);
            }
        });
        findViewById(R.id.navigate_now_playing).setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(Library.this, Now_Playing.class);
                startActivity(nowPlayingIntent);
            }
        });
    }
}
