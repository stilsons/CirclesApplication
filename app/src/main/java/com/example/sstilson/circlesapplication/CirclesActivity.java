package com.example.sstilson.circlesapplication;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.example.sstilson.circlesapplication.R;

public class CirclesActivity extends Activity {

    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("App", "Now in onCreate().");

        image = (ImageView)findViewById(R.id.imageView1);
        // image.setImageResource(R.drawable.circles);
    }

}