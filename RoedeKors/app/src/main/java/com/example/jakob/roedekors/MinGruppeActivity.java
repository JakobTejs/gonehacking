package com.example.jakob.roedekors;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

public class MinGruppeActivity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_min_gruppe);

        Button donerKnap = (Button) findViewById(R.id.button);
        final MinGruppeActivity tmp = this;
        donerKnap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(tmp, gruppenActivity.class);
                startActivity(myIntent);
            }
        });
    }

}
