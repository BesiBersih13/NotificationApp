package com.example.notificationapp;

import android.app.Notification;
import android.app.NotificationManager;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private NotificationManager notificationManager;
    private static final int NOTIFICATION_ID=0;

    private Button notifyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        notificationManager=(NotificationManager)getSystemService(NOTIFICATION_SERVICE);
        notifyButton=(Button)findViewById(R.id.notify);

        notifyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendNotification();
            }
        });
    }

    public void sendNotification(){
        NotificationCompat.Builder notifyBuilder = new NotificationCompat.Builder(this)
                .setContentTitle("Content Title")
                .setContentText("Content Notification")
                .setSmallIcon(R.mipmap.ic_launcher_round);

        Notification notification=notifyBuilder.build();
        notificationManager.notify(NOTIFICATION_ID,notification);
    }
}
