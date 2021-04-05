package com.example.tugas31;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickhospital(View view) {
        Intent intent = new Intent(this, hospital.class);
        startActivity(intent);
    }

    public void clickpolice(View view) {
        Intent intent = new Intent(this, police.class);
        startActivity(intent);
    }

    public void clickmarket(View view) {
        Intent intent = new Intent(this, market.class);
        startActivity(intent);
    }

    public void clickschool(View view) {
        Intent intent = new Intent(this, school.class);
        startActivity(intent);
    }
}