package com.example.database;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    EditText name,password;
    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        name=findViewById(R.id.et_uname);
        password=findViewById(R.id.et_upassword);
        preferences=getSharedPreferences("apssdc",MODE_PRIVATE);
    }

    public void sub(View view) {
        String user_givenname=name.getText().toString();
        String user_givenpassword=password.getText().toString();
        String reg_username=preferences.getString("name","");
        String reg_userpassword=preferences.getString("password","");
        if (user_givenname.equals(reg_username) && user_givenpassword.equals(reg_userpassword)){
            Toast.makeText(this, "Login sucessful", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "Login fail", Toast.LENGTH_SHORT).show();
        }


    }
}