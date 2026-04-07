package com.example.projetandroid.classes;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;
@Entity
public class Personne{
    @PrimaryKey(autoGenerate = true)
    private long idP;
    protected String nomP;
    protected String prenomP;
    protected String telephoneP;
    protected String mailP;

    protected String mdpP;
    private long typeUId;

    public Personne(String nomP, String prenomP, String telephoneP, String mailP, String mdpP, long typeUId) {

        this.nomP = nomP;
        this.prenomP = prenomP;
        this.telephoneP = telephoneP;
        this.mailP = mailP;
        this.mdpP = mdpP;
        this.typeUId = typeUId;
    }

    public long getNumP() {
        return idP;
    }

    public String getNomP() {
        return nomP;
    }

    public String getPrenomP() {
        return prenomP;
    }

    public String getTelephoneP() {
        return telephoneP;
    }

    public String getMailP() {
        return mailP;
    }

    public String getMdpP() {
        return mdpP;
    }


    @Override
    public String toString() {
        return "Personne{" +
                "numP=" + idP +
                ", nomP='" + nomP + '\'' +
                ", prenomP='" + prenomP + '\'' +
                ", telephoneP='" + telephoneP + '\'' +
                ", mailP='" + mailP + '\'' +
                ", mdpP='" + mdpP + '\'' +
                '}';
    }

    public void setNumP(long idP) {
        this.idP = idP;
    }

    public void setNomP(String nomP) {
        this.nomP = nomP;
    }

    public void setPrenomP(String prenomP) {
        this.prenomP = prenomP;
    }

    public void setTelephoneP(String telephoneP) {
        this.telephoneP = telephoneP;
    }

    public void setMailP(String mailP) {
        this.mailP = mailP;
    }

    public void setMdpP(String mdpP) {
        this.mdpP = mdpP;
    }
    public long getIdP() {
        return idP;
    }

    public void setIdP(long idP) {
        this.idP = idP;
    }

    public long getTypeUId() {
        return typeUId;
    }

    public void setTypeUId(long typeUId) {
        this.typeUId = typeUId;
    }

}
