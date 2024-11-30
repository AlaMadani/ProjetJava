/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Operations;

/**
 *
 * @author PC
 */
import model.Personnes.Client;
import java.util.Scanner;
public final class Facture_Client extends Facture{
    private Client client;

    public Facture_Client(Client client, int numFact, String dateFact, Commande commande, Double montant) {
        super(numFact, dateFact, commande, montant);
        this.client = client;
    }

    
    public Facture_Client() {
    }
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    
    public double calculerMontant(){
        double s=commande.getArticles().entrySet().stream().mapToDouble(entry->entry.getKey().getPrixv()*entry.getValue()).sum();
        setMontant(s);
        Calculable montant=(f)->f.getCommande().getArticles().entrySet().stream().mapToDouble(entry->entry.getKey().getPrixv()*entry.getValue()).sum();
        s=montant.calculerMontant(this);
        return s;
    }
    public void lireFactureCAuClavier(Scanner sc){
        System.out.println("saisir la numero de facture");
        this.numFact=sc.nextInt();
        System.out.println("saisir la date de la facture");
        this.dateFact=sc.next();
    }

    @Override
    public String toString() {
        return super.toString()+"Facture_Client{" + "client=" + client + '}';
    }
    
}
