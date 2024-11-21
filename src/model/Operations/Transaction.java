/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operations;

/**
 *
 * @author PC
 */
public class Transaction {
    private final int numTrans;
    private final String typePaiement;
    private Facture facture;
    private final String date;

    public Transaction(int numTrans, String typePaiement, Facture facture, String date) {
        this.numTrans = numTrans;
        this.typePaiement = typePaiement;
        this.facture = facture;
        this.date = date;
    }
     public Transaction(int numTrans, String typePaiement, String date) {
        this.numTrans = numTrans;
        this.typePaiement = typePaiement;
        this.date = date;
    }

    public void setFacture(Facture facture) {
        this.facture = facture;
    }
    
   
    
    public int getNumTrans() {
        return numTrans;
    }

    public String getTypePaiement() {
        return typePaiement;
    }

    public Facture getFacture() {
        return facture;
    }

    public String getDate() {
        return date;
    }
    @Override
    public String toString(){
        return "numero transaction : "+numTrans+" facture : "+facture.toString()+" type de paiement : "+typePaiement+"date : "+date;
    }
    
}
