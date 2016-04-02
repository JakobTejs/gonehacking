package com.example.jakob.roedekors;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

public class MinSideActivity extends MainActivity {
    int MYID = R.id.action_min_side;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_min_side);

        int donation = 200;

        TextView totalDonation = (TextView) findViewById(R.id.totaldonation);
        TextView donationFamilie = (TextView) findViewById(R.id.donationFamilie);
        TextView donationBoern = (TextView) findViewById(R.id.donationBoern);
        TextView donationMyg = (TextView) findViewById(R.id.donationMyg);
        TextView donationBarsel = (TextView) findViewById(R.id.donationBarsel);

        totalDonation.setText(Integer.toString(donation));
        donationFamilie.setText(Integer.toString(donation / 430));
        donationBoern.setText(Integer.toString(donation / 35));
        donationMyg.setText(Integer.toString(donation / 50));
        donationBarsel.setText(Integer.toString(donation / 100));
    }

}
