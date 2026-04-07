package com.example.projetandroid.classes;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
@Entity
public class TypeEvenement {
    @PrimaryKey(autoGenerate = true)
    private long idTE;
    private String nomTE;

    public TypeEvenement(String nomTE) {
        this.nomTE = nomTE;
    }

    public long getIdTE() {
        return idTE;
    }

    public String getNomTE() {
        return nomTE;
    }

    @Override
    public String toString() {
        return "TypeEvenement{" +
                "idTE=" + idTE +
                ", nomTE='" + nomTE + '\'' +
                '}';
    }

    public void setIdTE(long idTE) {
        this.idTE = idTE;
    }

    public void setNomTE(String nomTE) {
        this.nomTE = nomTE;
    }
}
