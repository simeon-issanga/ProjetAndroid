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
    
    public Photos(String nomP, long idEm) {
        this.nomP = nomP;
        this.idEm = idEm;
    }

    public long getIdP() {
        return idP;
    }

    public void setIdP(long idP) {
        this.idP = idP;
    }

    public String getNomP() {
        return nomP;
    }

    public void setNomP(String nomP) {
        this.nomP = nomP;
    }

    public long getIdEm() {
        return idEm;
    }

    public void setIdEm(long idEm) {
        this.idEm = idEm;
    }

    @Override
    public String toString() {
        return "Photos{" +
                "idP=" + idP +
                ", nomP='" + nomP + '\'' +
                ", idEm=" + idEm +
                '}';
    }
}
