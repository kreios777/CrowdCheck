package com.example.customchu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;


import com.jsibbold.zoomage.ZoomageView;

public class updatedlibrary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_updatedlibrary);

        //Navigation
        ImageButton mapBack = findViewById(R.id.mapBack2);
        mapBack.setOnClickListener(view -> {
            Intent intent = new Intent(updatedlibrary.this, home.class);
            startActivity(intent);
        });

        Button nextbutton = findViewById(R.id.btnto2nd);
        nextbutton.setOnClickListener(view -> {
            Intent intent = new Intent(updatedlibrary.this, updatedlibraryb.class);
            startActivity(intent);
        });



        ZoomageView MapViewer = findViewById(R.id.img_view);

        // Declare the radiobs
        RadioButton radioNone = findViewById(R.id.radiobuttonnone);
        RadioButton radioSeats = findViewById(R.id.radiobuttonseats);
        RadioButton radioScanner = findViewById(R.id.radiobuttonscanner);
        RadioButton radioOpac = findViewById(R.id.radiobuttonopac);

        // Events for clicks
        radioNone.setOnClickListener(view -> MapViewer.setImageResource(R.drawable.svgf1base));
        radioSeats.setOnClickListener(view -> MapViewer.setImageResource(R.drawable.svgf1seats));
        radioScanner.setOnClickListener(view -> MapViewer.setImageResource(R.drawable.svgf1scanner));
        radioOpac.setOnClickListener(view -> MapViewer.setImageResource(R.drawable.svgf1opac));

    }
}