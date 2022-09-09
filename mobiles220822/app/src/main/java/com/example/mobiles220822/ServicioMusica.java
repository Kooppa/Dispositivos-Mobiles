package com.example.mobiles220822;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class ServicioMusica extends Service {
    public ServicioMusica() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}