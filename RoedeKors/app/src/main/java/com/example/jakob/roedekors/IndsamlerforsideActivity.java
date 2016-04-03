package com.example.jakob.roedekors;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

public class IndsamlerforsideActivity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indsamlerforside);

        Button qrButton = (Button) findViewById(R.id.qrbutton);
        final IndsamlerforsideActivity tmp = this;
        qrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(tmp, QRkodeActivity.class);
                startActivity(myIntent);
            }
        });

        Button donerKnap = (Button) findViewById(R.id.gruppeKnap);
        donerKnap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(tmp, MinGruppeActivity.class);
                startActivity(myIntent);
            }
        });
        Button minRute = (Button) findViewById(R.id.button2);
        minRute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(tmp, MinRuteActivity.class);
                startActivity(myIntent);
            }
        });
    }

}
