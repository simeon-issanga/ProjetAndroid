package com.example.projetandroid.classesDAO;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.projetandroid.classes.Personne;

import java.util.List;

@Dao
public interface PersonneDAO {
    
    @Query("SELECT * FROM Personne")
    LiveData<List<Personne>> getAll();
    @Query("SELECT * FROM Personne WHERE idP = :unId")
    LiveData<Personne> getPersonneById(long unId);
    
    @Insert
    void insert(Personne unePersonne);
    
    @Update
    void update(Personne unePersonne);

  
    @Delete
    void delete(Personne unePersonne);
}

