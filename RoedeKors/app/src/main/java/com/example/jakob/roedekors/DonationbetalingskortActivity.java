package com.example.jakob.roedekors;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class DonationbetalingskortActivity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donationbetalingskort);

        SeekBar seekBar = (SeekBar)findViewById(R.id.seekBarDonation);
        final TextView seekBarValue = (TextView)findViewById(R.id.beloeb);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
                // TODO Auto-generated method stub
                seekBarValue.setText(String.valueOf((progress/5)*5));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }
        });

        Button knap = (Button) findViewById(R.id.donationsknap);
        final DonationbetalingskortActivity tmp = this;
        knap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(tmp, MinSideActivity.class);
                startActivity(myIntent);
            }
        });
    }

}
