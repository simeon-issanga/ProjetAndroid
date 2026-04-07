package com.example.projetandroid.classesDAO;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.projetandroid.classes.Emplacement;
import com.example.projetandroid.classes.Photos;

import java.util.List;

@Dao
public interface PhotosDAO {
    @Query("SELECT * FROM Photos")
    LiveData<List<Photos>> getAll();

    @Query("select * from Photos where idEm = :unId")
    LiveData<Emplacement> getPhotosById(long unId);

    @Insert
    void insert(Photos unePhoto);

    @Delete
    void delete(Photos unePhoto);


}

