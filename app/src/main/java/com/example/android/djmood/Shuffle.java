package com.example.android.djmood;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Shuffle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shuffle);

        setTitle(R.string.navigation_shuffle);

        findViewById(R.id.navigate_library).setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent libraryIntent = new Intent(Shuffle.this, Library.class);
                startActivity(libraryIntent);
            }
        });

        findViewById(R.id.navigate_now_playing).setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(Shuffle.this, Now_Playing.class);
                startActivity(nowPlayingIntent);
            }
        });


    }

}
