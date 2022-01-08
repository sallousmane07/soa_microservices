package soa.project.medecin.model;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Ticket {
    @Id
    @GeneratedValue
    private int numticket;
    
    private String nom;
    private String prenom;
    private double poids;
    private int age;
    private float temperature;


    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public Ticket(){

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

}
