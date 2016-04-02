package com.example.jakob.roedekors;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
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
                long[] test =  {0, 300, 200, 300};
                NotificationCompat.Builder mBuilder =
                        new NotificationCompat.Builder(tmp)
                                .setSmallIcon(R.drawable.rodekorsqrpeter)
                                .setContentTitle("Noget med Syrien")
                                .setContentText("Det vrimler med mohammedanere!!")
                                .setAutoCancel(true)
                                .setVibrate(test)
                                .setTicker("Noget med Syrien")
                        ;
// Creates an explicit intent for an Activity in your app
                Intent resultIntent = new Intent(tmp, DonerActivity.class);

// The stack builder object will contain an artificial back stack for the
// started Activity.
// This ensures that navigating backward from the Activity leads out of
// your application to the Home screen.
                TaskStackBuilder stackBuilder = TaskStackBuilder.create(tmp);
// Adds the back stack for the Intent (but not the Intent itself)
                stackBuilder.addParentStack(DonerActivity.class);
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
    }

    int MYID = R.id.action_home;
}
