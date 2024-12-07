/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Personnes;

/**
 *
 * @author PC
 */
public sealed abstract class Personne permits Employer,Client,Fournisseur{
    private Integer id;
    private String nom;
    private String prenom;
    private Integer numtel;
    private String adresse;
    private String email;

    public Personne(Integer id, String nom, String prenom, Integer numtel, String adresse, String email) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.numtel = numtel;
        this.adresse = adresse;
        this.email = email;
    }

    public Personne(String nom) {
        this.nom = nom;
    }

    

    public Personne(int id) {
        this.id = id;
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

    public int getNumtel() {
        return numtel;
    }

    public void setNumtel(int numtel) {
        this.numtel = numtel;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", numero de telephone=" + numtel + ", adresse=" + adresse + ", email=" + email ;
    }
    
}
