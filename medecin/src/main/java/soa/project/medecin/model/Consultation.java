package soa.project.medecin.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Consultation {
    
    @Id
    @GeneratedValue
    private int numConsultation;
   
    private int numTicket;
    private Date date;

    private String nom;
    private String prenom;
    private int age;
    private double montant;

    public Consultation() {
    }
    
    public int getNumConsultation() {
        return numConsultation;
    }

    public void setNumConsultation(int numConsultation) {
        this.numConsultation = numConsultation;
    }

    public int getNumTicket() {
        return numTicket;
    }

    public void setNumTicket(int numTicket) {
        this.numTicket = numTicket;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }



}
