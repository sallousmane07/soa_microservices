package soa.project.medecin.model;

public class Payement {
    private int numPayement;
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
