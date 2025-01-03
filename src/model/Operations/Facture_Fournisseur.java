/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Operations;

/**
 *
 * @author PC
 */
import model.Personnes.Fournisseur;
public final class Facture_Fournisseur extends Facture{
    private Fournisseur fournisseur;

    public Facture_Fournisseur(Fournisseur fournisseur, int numFact, String dateFact, Commande commande, Double montant) {
        super(numFact, dateFact, commande, montant);
        this.fournisseur = fournisseur;
    }

    public Fournisseur getFournisseur() {
        return fournisseur;
    }
    public Double calculerMontant(){
        Double s ;
    Calculable montant=(f)->f.getCommande().getArticles().entrySet().stream().mapToDouble(entry->entry.getKey().getPrixa()*entry.getValue()).sum();
        s=montant.calculermontant(this);
        setMontant(s);
        return s;
    }
}
