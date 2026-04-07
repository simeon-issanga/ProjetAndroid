package com.example.projetandroid.classesDAO;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.projetandroid.classes.Emplacement;
import com.example.projetandroid.classes.Evenement;

import java.util.List;

@Dao
public interface EvenementDAO {
    @Query("SELECT * FROM Evenement")
    LiveData<List<Emplacement>> getAll();

    @Query("select * from Evenement where idE = :unId")
    LiveData<Emplacement> getEvenementById(long unId);

    @Insert
    void insert(Evenement unEvenement);

    @Delete
    void delete(Evenement unEvenement);


}
