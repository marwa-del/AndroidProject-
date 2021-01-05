package com.example.miniprojet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class symptomactivity extends AppCompatActivity {
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptomactivity);

        toolbar =(Toolbar) findViewById (R.id.toolbar);
        toolbar.setTitle("Les Symptomes");
        setSupportActionBar (toolbar);
    }
}
