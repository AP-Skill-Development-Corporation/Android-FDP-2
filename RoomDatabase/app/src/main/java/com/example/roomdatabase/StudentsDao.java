package com.example.roomdatabase;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface StudentsDao
{
    @Insert
    void insertStudent(Student student);

    @Query("select * from studententity")
    List<Student> getAllData();
}
