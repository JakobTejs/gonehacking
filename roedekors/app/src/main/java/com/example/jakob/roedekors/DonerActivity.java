package com.example.jakob.roedekors;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

public class DonerActivity extends MainActivity {
    int MYID = R.id.action_doner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doner);

        Button donerKnap = (Button) findViewById(R.id.betalingskort);
        final DonerActivity tmp = this;
        donerKnap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(tmp, DonationbetalingskortActivity.class);
                startActivity(myIntent);
            }
        });
    }

}
