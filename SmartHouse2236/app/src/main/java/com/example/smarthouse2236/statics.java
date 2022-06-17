package com.example.smarthouse2236;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class statics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statics);
    }
    public void perehod12 (View v){
        Intent intent = new Intent(this,youhome.class);
        startActivity(intent);
    }
    public void perehod13 (View v){
        Intent intent = new Intent(this,seetings.class);
        startActivity(intent);
    }
}