package com.example.projetandroid;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "evenements")
public class Evenement {
    @PrimaryKey(autoGenerate = true)
    private long idE;
private String nomE;

    private int nbPers;
    private long typeEvenementId;


    public Evenement(String nomE, String nbPers, long typeEvenementId) {

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

    public String getNbPers() {
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

    public void setNbPers(String nbPers) {
        this.nbPers = nbPers;
    }
}


