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
    
    public Integer getNumCommande(){
        return commande.getNumCommande();
    }
    
    public Facture_Client() {
    }
    public Client getClient() {
        return client;
    }
    public String getNom(){
        return client.getNom();
    }
    public void setNom(String a){
        client.setNom(a);
    }
    public void setClient(Client client) {
        this.client = client;
    }
    
    public Double calculerMontant(){
        Double s;
        Calculable montant=(f)->f.getCommande().getArticles().entrySet().stream().mapToDouble(entry->entry.getKey().getPrixv()*entry.getValue()).sum();
        s=montant.calculermontant(this);
        setMontant(s);
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
