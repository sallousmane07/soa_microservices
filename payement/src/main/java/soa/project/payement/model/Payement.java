package soa.project.payement.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Payement {
    @Id
    @GeneratedValue
    private int numPayement;
    private Date date;
    private int numTicket;
    private String nom;
    private String prenom;
    private double montant;

    public Payement() {

    }

    public int getNumPayement() {
        return numPayement;
    }

    public void setNumPayement(int numPayement) {
        this.numPayement = numPayement;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getNumTicket() {
        return numTicket;
    }

    public void setNumTicket(int numTicket) {
        this.numTicket = numTicket;
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

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

}
