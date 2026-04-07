package com.example.projetandroid;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;

import java.util.List;

@Dao
public interface EmplacementDAO {
    @Query("SELECT * FROM Emplacement")
    LiveData<List<Emplacement>> getAll();

    @Query("select * from Emplacement where idEm = :unId")
    LiveData<Emplacement> getEmplacementById(long unId);

    @Insert
    void insert(Emplacement unEmplacement);

    @Delete
    void delete(Emplacement unEmplacement);


}


