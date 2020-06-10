package youtube.com.vidhvan.powerreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class PowerReceiver extends BroadcastReceiver {
    
    @Override
    public void onReceive(Context context, Intent intent) 
    {
        switch (intent.getAction()){
            case Intent.ACTION_POWER_CONNECTED: {
                Toast.makeText(context, "POWER CONNECTED", Toast.LENGTH_SHORT).show();
                break;
            }
            case Intent.ACTION_POWER_DISCONNECTED:{
                Toast.makeText(context, "POWER DISCONNECTED", Toast.LENGTH_SHORT).show();
            }
                
        }
    }
}
