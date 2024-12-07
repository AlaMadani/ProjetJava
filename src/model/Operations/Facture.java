/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Operations;

/**
 *
 * @author PC
 */
public sealed abstract class Facture permits Facture_Client,Facture_Fournisseur{
    protected int numFact;
    protected String dateFact;
    protected Commande commande;
    private Double montant;
    private boolean payee;

    public Facture(int numFact, String dateFact, Commande commande, Double montant) {
        this.numFact = numFact;
        this.dateFact = dateFact;
        this.commande = commande;
        this.montant = montant;
    }

    public Facture() {
    }
    
    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public void setDateFact(String dateFact) {
        this.dateFact = dateFact;
    }

    public boolean isPayee() {
        return payee;
    }

    public void setPayee(boolean payee) {
        this.payee = payee;
    }

    public int getNumFact() {
        return numFact;
    }

    public String getDateFact() {
        return dateFact;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }
    
    @Override
    public String toString(){
        return "numero Facture : "+numFact+" date : "+dateFact+" la commande : "+commande.toString()+" montant :"+montant+"\n"+"payee? :"+payee;
    }
    
}
