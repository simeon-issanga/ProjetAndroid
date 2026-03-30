package com.example.projetandroid;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface PhotosDAO {
    @Query("SELECT * FROM Photos")
    LiveData<List<Photos>> getAll();

    @Query("select * from Photos where idEm = :unId")
    LiveData<Emplacement> getEmplacementById(long unId);

    @Insert
    void insert(Photos unePhoto);

    @Delete
    void delete(Photos unePhoto);


}
