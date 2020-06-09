package youtube.com.vidhvan.notifications;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private NotificationManager nm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
    }

    public void sendNotification(View view)
    {

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            NotificationChannel nc = new NotificationChannel("pavan",
                    "Demo Channel", NotificationManager.IMPORTANCE_HIGH);
            nc.enableLights(true);
            nc.enableVibration(true);
            nm.createNotificationChannel(nc);
        }

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this,"pavan");
        builder.setSmallIcon(R.drawable.cute_face);
        builder.setContentTitle("Welcome to APSSDC's FDP on Android");
        builder.setContentText("Android FDP is Going On...");
        builder.setPriority(NotificationCompat.PRIORITY_MAX);
        builder.setAutoCancel(true);
        Intent i = new Intent(this,MainActivity.class);
        PendingIntent pi = PendingIntent.getActivity(this,12,i,PendingIntent.FLAG_UPDATE_CURRENT);
        builder.setContentIntent(pi);
        builder.addAction(R.drawable.cute_face,"Action-1",pi);
        Bitmap b = BitmapFactory.decodeResource(getResources(),R.drawable.taj);
        builder.setStyle(new NotificationCompat.BigPictureStyle().bigPicture(b));
        nm.notify(42,builder.build());

    }

    public void cancelNotificaiton(View view)
    {
        nm.cancelAll();
    }
}