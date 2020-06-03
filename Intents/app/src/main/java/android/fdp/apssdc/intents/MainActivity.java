package android.fdp.apssdc.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = findViewById(R.id.name);
    }

    public void moveNext(View view) {
        String n = et.getText().toString();
        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra("KEY",n);
        startActivity(intent);
    }
}