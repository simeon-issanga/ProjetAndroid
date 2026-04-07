package com.example.projetandroid.classes;

import androidx.room.Entity;
import androidx.room.ForeignKey;

@Entity(primaryKeys = {"idE","idP"},
        foreignKeys = {
                @ForeignKey(entity = Evenement.class, parentColumns = "idE",childColumns = "idE"),
                @ForeignKey(entity = Personne.class, parentColumns = "idP", childColumns = "idP")
})
public class Participer {
    long idE;
    long idP;
    String role;

    public Participer(long idE, long idP, String role) {
        this.idE = idE;
        this.idP = idP;
        this.role = role;
    }
    public long getIdE() {
        return idE;
    }

    public void setIdE(long idE) {
        this.idE = idE;
    }

    public long getIdP() {
        return idP;
    }

    public void setIdP(long idP) {
        this.idP = idP;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
