package com.example.projetandroid.classes;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Emplacement {
    @PrimaryKey(autoGenerate = true)
    private long idEm;
    private String nomEm;
    private int numRue;
    private String nomRue;
    private String Ville;
    private int cp;
    private int capacite;
    private float popularite;

    public Emplacement(int capacite, int cp, String ville, String nomRue, int numRue, String nomEm) {
        this.popularite = 0;
        this.capacite = capacite;
        this.cp = cp;
        Ville = ville;
        this.nomRue = nomRue;
        this.numRue = numRue;
        this.nomEm = nomEm;
    }
    public long getIdEm() {
        return idEm;
    }

    public String getNomEm() {
        return nomEm;
    }

    public int getNumRue() {
        return numRue;
    }

    public String getNomRue() {
        return nomRue;
    }

    public String getVille() {
        return Ville;
    }

    public int getCp() {
        return cp;
    }

    public int getCapacite() {
        return capacite;
    }

    public float getPopularite() {
        return popularite;
    }

    public void setPopularite(float popularite) {
        this.popularite = popularite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public void setVille(String ville) {
        Ville = ville;
    }

    public void setNomRue(String nomRue) {
        this.nomRue = nomRue;
    }

    public void setNumRue(int numRue) {
        this.numRue = numRue;
    }

    public void setNomEm(String nomEm) {
        this.nomEm = nomEm;
    }

    public void setIdEm(long idEm) {
        this.idEm = idEm;
    }

    @Override
    public String toString() {
        return "Emplacement{" +
                "idEm=" + idEm +
                ", nomEm='" + nomEm + '\'' +
                ", numRue=" + numRue +
                ", nomRue='" + nomRue + '\'' +
                ", Ville='" + Ville + '\'' +
                ", cp=" + cp +
                ", capacite=" + capacite +
                ", popularite=" + popularite +
                '}';
    }
}
