package com.example.customchu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;

import com.jsibbold.zoomage.ZoomageView;

public class updatedlibraryb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_updatedlibraryb);

        //Navigation
        ImageButton mapBack = findViewById(R.id.mapBack2);
        mapBack.setOnClickListener(view -> {
            Intent intent = new Intent(updatedlibraryb.this, home.class);
            startActivity(intent);
        });

        Button nextbutton = findViewById(R.id.btnto2nd);
        nextbutton.setOnClickListener(view -> {
            Intent intent = new Intent(updatedlibraryb.this, updatedlibrary.class);
            startActivity(intent);
        });



        ZoomageView MapViewer = findViewById(R.id.img_view);

        // Declare the radiobs
        RadioButton radioNone = findViewById(R.id.radiobuttonnone);
        RadioButton radioSeats = findViewById(R.id.radiobuttonseats);
        RadioButton radioScanner = findViewById(R.id.radiobuttonscanner);
        RadioButton radioOpac = findViewById(R.id.radiobuttonopac);

        // Events for clicks
        radioNone.setOnClickListener(view -> MapViewer.setImageResource(R.drawable.f2n3base));
        radioSeats.setOnClickListener(view -> MapViewer.setImageResource(R.drawable.f2n3seats));
        radioScanner.setOnClickListener(view -> MapViewer.setImageResource(R.drawable.f2n3scanner));
        radioOpac.setOnClickListener(view -> MapViewer.setImageResource(R.drawable.f2n3opac));



    }
}