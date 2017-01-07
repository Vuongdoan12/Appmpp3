package com.example.vuongdoan.appmp3.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.vuongdoan.appmp3.R;


public class ActivityPlaySong extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playsong);
        Intent intent = getIntent();

        Log.d("TAG",intent.getExtras().getString("ID"));
    }


}
