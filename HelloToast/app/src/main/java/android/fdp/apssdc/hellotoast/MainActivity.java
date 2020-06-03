package android.fdp.apssdc.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView result;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // connecting count_tv with result
        result = findViewById(R.id.count_tv);
    }

    /*The Following method will be invoked
    as soon as the Toast button is pressed*/
    public void showToast(View view) {
        Toast toast = Toast.makeText(this,"Hello Your Name",Toast.LENGTH_SHORT);
        toast.show();
    }

    /*The Following method will be invoked
    as soon as the Count button is pressed*/
    public void showCount(View view) {
        count++;
        result.setText(String.valueOf(count));
    }
}