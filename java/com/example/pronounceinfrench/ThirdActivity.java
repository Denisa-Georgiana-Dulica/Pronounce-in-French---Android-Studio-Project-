package com.example.pronounceinfrench;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_third);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button apple=findViewById(R.id.button_apple);
        Button banana=findViewById(R.id.button_banana);
        Button greape=findViewById(R.id.button_greape);
        Button stra=findViewById(R.id.button_stra);
        Button orange=findViewById(R.id. button_orange);

        apple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer media=MediaPlayer.create(getApplicationContext(),R.raw.apple);
                media.start();//pentru a porni sunetul
            }
        });
        banana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer media=MediaPlayer.create(getApplicationContext(),R.raw.banana);
                media.start();//pentru a porni sunetul
            }
        });
        greape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer media=MediaPlayer.create(getApplicationContext(),R.raw.greape);
                media.start();//pentru a porni sunetul
            }
        });
        orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer media=MediaPlayer.create(getApplicationContext(),R.raw.orange);
                media.start();//pentru a porni sunetul
            }
        });
        stra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer media=MediaPlayer.create(getApplicationContext(),R.raw.strawberry);
                media.start();//pentru a porni sunetul
            }
        });
    }
}