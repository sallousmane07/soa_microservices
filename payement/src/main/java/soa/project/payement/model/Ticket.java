package soa.project.payement.model;

import java.util.Date;

public class Ticket {
    private int numticket;

    
    public int getNumticket() {
        return numticket;
    }


    public void setNumticket(int numticket) {
        this.numticket = numticket;
    }


    public String getNom() {
        return nom;
    }


    public void setNom(String nom) {
        this.nom = nom;
    }


    public String getPrenom() {
        return prenom;
    }


    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }


    public Date getDate() {
        return date;
    }


    public void setDate(Date date) {
        this.date = date;
    }


    private String nom;
    private String prenom;
    private Date date;
    

    public Ticket(){

    }
}
