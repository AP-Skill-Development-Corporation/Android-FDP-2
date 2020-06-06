package com.example.optionsmenu_fdp1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1:
                Toast.makeText(this, "You Selected Settings",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.item2:
                Toast.makeText(this, "You Selected Profile",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.item3:
                AlertDialog.Builder  builder = new AlertDialog.Builder(this);
                builder.setTitle("AlertDialogBox");
                builder.setMessage("This is a Simple AlertDialog Box");
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "You choose yes action for alertbox", Toast.LENGTH_SHORT).show();

                    }
                });
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                        finish();
                        Toast.makeText(MainActivity.this, "You Choose no action for alertbox", Toast.LENGTH_SHORT).show();

                    }
                });
                AlertDialog alert = builder.create();
                alert.show();
                Toast.makeText(this, "You Selected AlertDialogBox",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.item4:
                Toast.makeText(this, "You Selected Logout",
                        Toast.LENGTH_SHORT).show();
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}