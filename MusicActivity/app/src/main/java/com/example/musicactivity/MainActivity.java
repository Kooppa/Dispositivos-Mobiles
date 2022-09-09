package com.example.musicactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mySong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mySong=MediaPlayer.create(MainActivity.this,R.raw.wallows);
    }
    public void PlayMusic(View v){
        if(mySong.isPlaying())
            mySong.pause();
        else
            mySong.start();
    }
    @Override
    protected  void onPause(){
        super.onPause();
        mySong.release();
    }
}
