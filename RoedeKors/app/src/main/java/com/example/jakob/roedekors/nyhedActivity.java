package com.example.jakob.roedekors;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

public class nyhedActivity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nyhed);

        Button donerKnap = (Button) findViewById(R.id.Donernu);
        final nyhedActivity tmp = this;
        donerKnap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(tmp, DonerActivity.class);
                startActivity(myIntent);
            }
        });
    }

}
