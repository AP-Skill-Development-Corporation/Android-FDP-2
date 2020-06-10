package youtube.com.vidhvan.powerreceiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private PowerReceiver mPowerReceiver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPowerReceiver = new PowerReceiver();

        IntentFilter i = new IntentFilter();
        // add the broadcast receivers
        i.addAction(Intent.ACTION_POWER_CONNECTED); // When charger is plugged in - This message is sent out by the system
        i.addAction(Intent.ACTION_POWER_DISCONNECTED); // When charger is unplugged- This message is sent out by the system

        this.registerReceiver(mPowerReceiver,i);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        this.unregisterReceiver(mPowerReceiver);
    }
}