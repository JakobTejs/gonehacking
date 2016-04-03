package com.example.jakob.roedekors;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button notificationButton = (Button) findViewById(R.id.notificationButton);

        final HomeActivity tmp = this;

        notificationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                long[] test = {0, 300, 200, 300};
                NotificationCompat.Builder mBuilder =
                        new NotificationCompat.Builder(tmp)
                                .setSmallIcon(R.mipmap.ic_launcher)
                                .setContentTitle("Jordskælv")
                                .setContentText("Ødelæggende jordskælv har ramt syddansk-mini-polynesien")
                                .setAutoCancel(true)
                                .setVibrate(test)
                                .setTicker("Jordskælv");
// Creates an explicit intent for an Activity in your app
                Intent resultIntent = new Intent(tmp, nyhedActivity.class);

// The stack builder object will contain an artificial back stack for the
// started Activity.
// This ensures that navigating backward from the Activity leads out of
// your application to the Home screen.
                TaskStackBuilder stackBuilder = TaskStackBuilder.create(tmp);
// Adds the back stack for the Intent (but not the Intent itself)
                stackBuilder.addParentStack(nyhedActivity.class);
// Adds the Intent that starts the Activity to the top of the stack
                stackBuilder.addNextIntent(resultIntent);
                PendingIntent resultPendingIntent =
                        stackBuilder.getPendingIntent(
                                0,
                                PendingIntent.FLAG_UPDATE_CURRENT
                        );
                mBuilder.setContentIntent(resultPendingIntent);
                NotificationManager mNotificationManager =
                        (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
// mId allows you to update the notification later on.

                mNotificationManager.notify(1, mBuilder.build());
            }
        });
        Button butikkerKnap = (Button) findViewById(R.id.button8);
        butikkerKnap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(tmp, butikkerActivity.class);
                startActivity(myIntent);
            }
        });
    }

    int MYID = R.id.action_home;
}
