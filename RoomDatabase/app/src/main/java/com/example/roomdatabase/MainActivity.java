package com.example.roomdatabase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private StudentDatabase studentDatabase;
    private EditText name,email;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.et_name);
        email = findViewById(R.id.et_mailId);
        result = findViewById(R.id.text_view);

        studentDatabase = Room
                .databaseBuilder(this,StudentDatabase.class,"StudentsDB")
                .allowMainThreadQueries()
                .build();

    }

    public void saveData(View view)
    {
        String n = name.getText().toString();
        String e = email.getText().toString();
        Student student = new Student(n,e);
        studentDatabase.studentsDao().insertStudent(student);
        Toast.makeText(this, "Insertion is successful", Toast.LENGTH_SHORT).show();
        getData();
    }

    private void getData()
    {
        List<Student> studentList = studentDatabase.studentsDao().getAllData();
        result.setText("");
        for(Student s : studentList){
            result.append(s.getId()+" "+s.getName()+" "+s.getEmail()+"\n\n");
        }
    }
}