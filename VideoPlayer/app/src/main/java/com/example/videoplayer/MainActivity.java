package com.example.videoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView player  = findViewById(R.id.Player);
        player.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.video);
        MediaController mediaController = new MediaController(this);
        player.setMediaController(mediaController);
        mediaController.setAnchorView(player);
        player.start();
    }
}