package pe.pedro.miservicio;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.support.v7.app.NotificationCompat;
import android.widget.Toast;

/**
 * Created by alumno on 12/09/16.
 */
public class Servicio extends Service{
    public final int FOREGROUND_NOTIFIATION_ID=1;
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        showMessage("Llamando a onCreate()");
        startForeground (FOREGROUND_NOTIFIATION_ID,createForegroundNotification());
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        showMessage("Llamando a onStartCommand()");
        //return super.onStartCommand(intent, flags, startId);
        return START_NOT_STICKY;
    }

    @Override
    public void onDestroy() {
        showMessage("Llamando a onDestroy()");
        super.onDestroy();
    }

    private Notification createForegroundNotification(){
        return new NotificationCompat.Builder(this)
                .setContentTitle("titulo de Mi Servicio")
                .setContentText("Texto de mi Servicio")
                .setSmallIcon(R.mipmap.ic_launcher)
                .build();

    }

    private void showMessage(final String mensaje  ){
        Toast.makeText(Servicio.this,mensaje, Toast.LENGTH_SHORT).show();
    }
}
