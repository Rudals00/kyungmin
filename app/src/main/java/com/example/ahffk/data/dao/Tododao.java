package com.example.ahffk.data.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.ahffk.data.entity.Todoitem;

import java.util.List;

@Dao
public interface Tododao {
    @Insert
    void insertTodo(Todoitem item);
    @Delete
    void deleteTodo(Todoitem item);
    @Update
    void UpdateTodo(Todoitem item);

    @Query("SELECT * FROM Todo")
    List<Todoitem> getAllTodo();

    @Query("SELECT * FROM Todo WHERE id=:id")
    Todoitem getTodo(int id);


}
