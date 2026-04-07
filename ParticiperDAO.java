package com.example.projetandroid.classesDAO;

import androidx.lifecycle.LiveData;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.projetandroid.classes.Participer;

import java.util.List;

public interface ParticiperDAO {
    @Query("SELECT * FROM Participer")
    LiveData<List<Participer>> getAll();
    @Query("select * from Participer where idP = :unId")
    LiveData<Participer> getParticiperByIdP(long unId);
    @Query("select * from Participer where idE = :unId")
    LiveData<Participer> getParticiperByIdE(int unId);
    @Insert
    void insert(Participer objPrevoir);
    @Delete
    void delete(Participer objPrevoir);
}
