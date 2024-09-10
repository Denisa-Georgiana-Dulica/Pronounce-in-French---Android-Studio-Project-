package com.example.pronounceinfrench;

import android.content.res.Resources;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button red=findViewById(R.id.button_red);
        Button blue=findViewById(R.id.button_blue);
        Button green=findViewById(R.id.button_green);
        Button yellow=findViewById(R.id.button_yellow);
        Button pink=findViewById(R.id. button_pink);

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer media=MediaPlayer.create(getApplicationContext(),R.raw.red);
                media.start();//pentru a porni sunetul
            }
        });
        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer media=MediaPlayer.create(getApplicationContext(),R.raw.blue);
                media.start();//pentru a porni sunetul
            }
        });
        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer media=MediaPlayer.create(getApplicationContext(),R.raw.green);
                media.start();//pentru a porni sunetul
            }
        });
        yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer media=MediaPlayer.create(getApplicationContext(),R.raw.yellow);
                media.start();//pentru a porni sunetul
            }
        });
        pink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer media=MediaPlayer.create(getApplicationContext(),R.raw.pink);
                media.start();//pentru a porni sunetul
            }
        });
    }
}