package com.example.android.djmood;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Now_Playing extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        setTitle(R.string.navigation_now_playing);

        findViewById(R.id.navigate_library).setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent libraryIntent = new Intent(Now_Playing.this, Library.class);
                startActivity(libraryIntent);
            }
        });
        findViewById(R.id.navigate_shuffle).setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent shuffleIntent = new Intent(Now_Playing.this, Shuffle.class);
                startActivity(shuffleIntent);
            }
        });


    }
}
