package com.vijayjaidewan01vivekrai.backgroundservice_github;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

/**
 * Created by MR VIVEK RAI on 04-06-2018.
 */

public class MyService extends Service {

    MediaPlayer mediaPlayer;

    public MyService() {

    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        return null;
    }

    @Override
    public void onStart(Intent intent, int startId) {
        mediaPlayer.start();
        Toast.makeText(this, "Service started!", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onCreate() {

        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.song);
        Toast.makeText(this, "Service created!", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onDestroy() {
        mediaPlayer.stop();
        Toast.makeText(this, "Service stopped!", Toast.LENGTH_SHORT).show();

    }
}
