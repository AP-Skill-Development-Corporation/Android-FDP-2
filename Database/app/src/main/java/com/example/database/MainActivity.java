package com.example.database;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText name,email,password;
SharedPreferences preferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.et_name);
        email=findViewById(R.id.et_email);
        password=findViewById(R.id.et_password);
        preferences=getSharedPreferences("apssdc",MODE_PRIVATE);
    }

    public void reg(View view) {
        String s=name.getText().toString();
        String s1=password.getText().toString();
        SharedPreferences.Editor editor=preferences.edit(); // edit mode on
        editor.putString("name",s);
        editor.putString("password",s1);
        editor.apply();
        Toast.makeText(this, "Sucessfully regiter", Toast.LENGTH_SHORT).show();
        Intent i=new Intent(this,MainActivity2.class);
        startActivity(i);

    }

    public void logActivity(View view) {
        Intent i=new Intent(this,MainActivity2.class);
        startActivity(i);
    }
}