package com.example.inputcontrollers_fdp1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton radiob1, radiob2;
    CheckBox cb1, cb2, cb3;
    Switch aSwitch;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayout = findViewById(R.id.linear1);
        aSwitch = findViewById(R.id.switch1);
        cb1 = findViewById(R.id.check1);
        cb2 = findViewById(R.id.check2);
        cb3 = findViewById(R.id.check3);
        radioGroup = findViewById(R.id.rg1);
        radiob1 = findViewById(R.id.rb1);
        radiob2 = findViewById(R.id.rb2);

        aSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(aSwitch.isChecked()){
                    linearLayout.setBackgroundColor(Color.RED);
                }
                else{
                    linearLayout.setBackgroundColor(Color.YELLOW);
                }
            }
        });

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rb1:
                        Toast.makeText(MainActivity.this, "Male", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rb2:
                        Toast.makeText(MainActivity.this, "Female", Toast.LENGTH_SHORT).show();
                        break;

                }
            }
        });
    }

    public void image(View view) {
        Toast.makeText(this, "You Selected Image", Toast.LENGTH_LONG).show();
    }

    public void submit(View view) {
        if (cb1.isChecked() && cb2.isChecked() && cb3.isChecked()) {
            Toast.makeText(this, "" + cb1.getText() +
                    "," + cb2.getText() + "," + cb3.getText(), Toast.LENGTH_SHORT).show();
        } else if (cb1.isChecked() && cb2.isChecked()) {
            Toast.makeText(this, "" + cb1.getText() +
                    "," + cb2.getText(), Toast.LENGTH_SHORT).show();
        } else if (cb2.isChecked() && cb3.isChecked()) {
            Toast.makeText(this, "" + cb2.getText() +
                    "," + cb3.getText(), Toast.LENGTH_SHORT).show();
        } else if (cb1.isChecked() && cb3.isChecked()) {
            Toast.makeText(this, "" + cb1.getText() +
                    "," + cb3.getText(), Toast.LENGTH_SHORT).show();
        } else if (cb1.isChecked()) {
            Toast.makeText(this, "" + cb1.getText(), Toast.LENGTH_SHORT).show();
        } else if (cb2.isChecked()) {
            Toast.makeText(this, "" + cb2.getText(), Toast.LENGTH_SHORT).show();
        } else if (cb3.isChecked()) {
            Toast.makeText(this, "" + cb3.getText(), Toast.LENGTH_SHORT).show();
        }

    }
}