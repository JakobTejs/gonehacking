package com.example.jakob.roedekors;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class FrivilligActivity extends MainActivity {
    int MYID = R.id.action_frivillig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frivillig);

        TextView textView =(TextView)findViewById(R.id.textView3);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        textView =(TextView)findViewById(R.id.textView16);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        textView =(TextView)findViewById(R.id.textView17);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        textView =(TextView)findViewById(R.id.textView18);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        textView =(TextView)findViewById(R.id.textView19);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        textView =(TextView)findViewById(R.id.textView20);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        textView =(TextView)findViewById(R.id.textView21);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        textView =(TextView)findViewById(R.id.textView25);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        textView =(TextView)findViewById(R.id.textView22);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        textView =(TextView)findViewById(R.id.textView23);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView =(TextView)findViewById(R.id.textView24);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

}
