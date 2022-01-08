package soa.project.consultation.santeaccueil.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Ticket {
    @Id
    @GeneratedValue 
    private int numticket;
    
    private String nom;
    private String prenom;
    private Date date;
    private int age;
    private double temperature;
    private double poids;

    public Ticket(){

    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getTempereature(){
        return temperature;
    }
    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

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
     
        this.date =date;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    

}
