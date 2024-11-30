/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Personnes;

/**
 *
 * @author PC
 */
import model.Operations.Transaction;
import java.util.ArrayList;
public final class Fournisseur extends Personne{
    private String entreprise;
    private ArrayList<Transaction> listTransaction;

    public Fournisseur(String entreprise, ArrayList<Transaction> listTransaction, int id, String nom, String prenom, int numtel, String adresse, String email) {
        super(id, nom, prenom, numtel, adresse, email);
        this.entreprise = entreprise;
        this.listTransaction = listTransaction;
    }

    

    public String getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(String entreprise) {
        this.entreprise = entreprise;
    }
    
}
