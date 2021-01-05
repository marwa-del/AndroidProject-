package com.example.miniprojet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class homeactivity extends AppCompatActivity implements View.OnClickListener{
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homeactivity);

        toolbar =(Toolbar) findViewById (R.id.toolbar);
        toolbar.setTitle("Home");
        setSupportActionBar (toolbar);

        ((CardView) findViewById(R.id.cv1)).setOnClickListener(this);
        ((CardView) findViewById(R.id.cv2)).setOnClickListener(this);
        ((CardView) findViewById(R.id.cv3)).setOnClickListener(this);
        ((CardView) findViewById(R.id.cv4)).setOnClickListener(this);
        ((CardView) findViewById(R.id.cv5)).setOnClickListener(this);
        ((CardView) findViewById(R.id.cv6)).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent ;
        switch (v.getId()) {
            case R.id.cv1:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://coronavirus.jhu.edu/map.html"));
                startActivity(intent);
                break;
            case R.id.cv2:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.worldometers.info/coronavirus/"));
                startActivity(intent);
                break;
            case R.id.cv3:
                intent = new Intent(this, symptomactivity.class);
                startActivity(intent);
                break;
            case R.id.cv4:
                intent = new Intent(this, precautionactivity.class);
                startActivity(intent);
                break;
            case R.id.cv5:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.stopcorona.gov.tn/?fbclid=IwAR0ffRbeDNUxbAMiY_sO2kKvN8J5BO_PXB15g97UoDAN9mk3jEaBY3RsV7I"));
                startActivity(intent);
                break;
            case R.id.cv6:
                intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:190"));
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
