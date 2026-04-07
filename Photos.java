package com.example.projetandroid.classes;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(
        foreignKeys = @ForeignKey(
                entity = Emplacement.class, // classe liée par une clé étrangère
                parentColumns = "idEm", // idC dans em
                childColumns = "idEm" // idC dans Photos
        )
)
public class Photos {
    @PrimaryKey(autoGenerate = true)
    private long idP;
    private String nomP;

    private long idEm;


}
