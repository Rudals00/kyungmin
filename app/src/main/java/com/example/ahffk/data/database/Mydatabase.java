package com.example.ahffk.data.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.ahffk.data.dao.Tododao;
import com.example.ahffk.data.entity.Todoitem;

@Database(version =1,entities = {Todoitem.class})
public abstract class Mydatabase extends RoomDatabase {
    abstract public Tododao todoDao();

    private static Mydatabase myDatabase;

    public static Mydatabase getInstance(Context context){
        if(myDatabase==null){
            myDatabase= Room.databaseBuilder(context.getApplicationContext(),
                    Mydatabase.class,"myDatabase.db")
                    .allowMainThreadQueries()
                    .build();
        }return;

    }
}
