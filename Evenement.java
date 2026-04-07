package com.example.projetandroid.classes;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(
        foreignKeys = @ForeignKey(
                entity = TypeEvenement.class, // classe liée par une clé étrangère
                parentColumns = "idTE", // idC dans em
                childColumns = "typeEvenementId" // idC dans Photos
        )
)
public class Evenement {
    @PrimaryKey(autoGenerate = true)
    private long idE;
    private String nomE;

    private int nbPers;
    private long typeEvenementId;


    public Evenement(String nomE, int nbPers, long typeEvenementId) {

        this.nomE = nomE;
        this.nbPers = nbPers;
        this.typeEvenementId = typeEvenementId;
    }

    public long getIdE() {
        return idE;
    }

    public String getNomE() {
        return nomE;
    }

    public int getNbPers() {
        return nbPers;
    }

    @Override
    public String toString() {
        return "Evenement{" +
                "idE=" + idE +
                ", nomE='" + nomE + '\'' +
                ", nbPers='" + nbPers + '\'' +
                '}';
    }

    public void setIdE(long idE) {
        this.idE = idE;
    }

    public void setNomE(String nomE) {
        this.nomE = nomE;
    }

    public void setNbPers(int nbPers) {
        this.nbPers = nbPers;
    }
}
