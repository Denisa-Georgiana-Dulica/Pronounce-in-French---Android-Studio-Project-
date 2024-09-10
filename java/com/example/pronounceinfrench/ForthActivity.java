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

public class ForthActivity extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_forth);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //HANDLING MULTIPLE BUTTONS' CLICK
        //1.implements View.OnClickListener this has just one method onClick
        Button bear=findViewById(R.id.button_bear);
        Button zebra=findViewById(R.id.button_zebra);
        Button ele=findViewById(R.id.button_elephant);
        Button horse=findViewById(R.id.button_horse);
        Button lion=findViewById(R.id. button_lion);

        bear.setOnClickListener(this);//it redirects the call to the on click method because "this" refers to the implemention of View.OnClickListener interface
        zebra.setOnClickListener(this);
        ele.setOnClickListener(this);
        horse.setOnClickListener(this);
        lion.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
            int id=view.getId();
        if(id==R.id.button_lion)
        {
           sound(R.raw.lion);
        }
        else  if(id==R.id.button_zebra){
            sound(R.raw.zebra);
        }
        else  if(id==R.id.button_bear){
            sound(R.raw.bear);
        }
        else  if(id==R.id.button_elephant){
            sound(R.raw.elephant);
        }
        else  if(id==R.id.button_horse){
            sound(R.raw.horse);
        }

    }

    public void sound(int id)
    {
        MediaPlayer media=MediaPlayer.create(getApplicationContext(),id);
        media.start();
    }
}