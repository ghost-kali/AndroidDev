package com.example.musicx;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
   MediaPlayer Player;
   public void play(View view){
       Player.start();//For Playing the Music
   }
   public void pause(View view){
       Player.pause();//For Pausing the Music
   }
   public void stop(View view){
       Player.stop();//For Stoping the Music
   }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Player = MediaPlayer.create(this,R.raw.music);
    }

}