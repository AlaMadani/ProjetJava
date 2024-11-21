/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnes;

/**
 *
 * @author PC
 */
public abstract class Employer extends Personne {
    private double salaire;
    private String numCompteBanc;

    public Employer(double salaire, String numCompteBanc, int id, String nom, String prenom, int numtel, String adresse, String email) {
        super(id, nom, prenom, numtel, adresse, email);
        this.salaire = salaire;
        this.numCompteBanc = numCompteBanc;
    }

    

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public String getNumCompteBanc() {
        return numCompteBanc;
    }

    public void setNumCompteBanc(String numCompteBanc) {
        this.numCompteBanc = numCompteBanc;
    }

    @Override
    public String toString() {
        return super.toString()+"salaire=" + salaire + ", numCompteBanc=" + numCompteBanc + '}';
    }
    public void demanderConge(int j){
        ////////////////////////
    }
}
