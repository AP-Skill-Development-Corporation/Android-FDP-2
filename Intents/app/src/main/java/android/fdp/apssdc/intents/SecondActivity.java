package android.fdp.apssdc.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView greeting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        greeting = findViewById(R.id.textView);

        /* We are going to receive the name from first activity and
        * display that here.*/
        String name = getIntent().getStringExtra("KEY");
        greeting.setText("Hi, "+name);

    }
}