/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Personnes;

/**
 *
 * @author PC
 */
public final class Agent_Securite extends Employer{
    private String heureDeb;
    private String heureFin;
    private String Secteur;

    public Agent_Securite(String heureDeb, String heureFin, String Secteur, double salaire, String numCompteBanc, int id, String nom, String prenom, int numtel, String adresse, String email) {
        super(salaire, numCompteBanc, id, nom, prenom, numtel, adresse, email);
        this.heureDeb = heureDeb;
        this.heureFin = heureFin;
        this.Secteur = Secteur;
    }

    

    public String getHeureDeb() {
        return heureDeb;
    }

    public void setHeureDeb(String heureDeb) {
        this.heureDeb = heureDeb;
    }

    public String getHeureFin() {
        return heureFin;
    }

    public void setHeureFin(String heureFin) {
        this.heureFin = heureFin;
    }

    public String getSecteur() {
        return Secteur;
    }

    public void setSecteur(String Secteur) {
        this.Secteur = Secteur;
    }
    
    
}
