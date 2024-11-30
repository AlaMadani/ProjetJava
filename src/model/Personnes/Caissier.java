/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Personnes;

/**
 *
 * @author PC
 */
import model.Articles.Boutique;
import java.util.Scanner;
import model.Operations.Commande;
import model.Operations.Transaction;
import java.util.ArrayList;
import model.Operations.Caisse;
import model.Operations.Facture_Client;
public non-sealed class Caissier extends Employer implements Connectable{
    private String username;
    private String password;
    private Caisse caisse;
    private ArrayList<Transaction> listCom;
    private boolean connecte=false;

    public Caissier(String username, String password, double salaire, String numCompteBanc, int id, String nom, String prenom, int numtel, String adresse, String email) {
        super(salaire, numCompteBanc, id, nom, prenom, numtel, adresse, email);
        this.username = username;
        this.password = password;
        listCom=new ArrayList<>();
    }
    
    public String getDated() {
                return null;
            }


            public String getDatef() {
                return null;
            }
    public Caisse getCaisse() {
        return caisse;
    }

    public void setCaisse(Caisse caisse) {
        this.caisse = caisse;
    }

    
    public String getUsername() {
        if(connecte==true)
        return username;
        else return "Vous n'etes pas conectee!!!";
    }

    public void setUsername(String username) {
         if(connecte==true)
        this.username = username;
    }

    public String getPassword() {
        if(connecte==true)
        return password;
        else return "Vous n'etes pas conectee!!!";

    }

    public void setPassword(String password) {
        if(connecte==true)
        this.password = password;
        
    }

    public boolean isConnecte() {
        return connecte;
    }
    public boolean ouvrirCaisse(){
        if(connecte==true){
            caisse.setStatut("ouverte");
            return true;
        }
        else return false;
        
    }
    public void fermerCaisse(){
        caisse.setStatut("fermee");
    }
    public Commande creerCommande(Boutique b,Scanner sc){
       Commande c=new Commande();
       c.lireCommandeAuClavier(b,sc);
       return c;
    }
    public Facture_Client creerFactureC(Boutique b,Commande c,Client cl,Scanner sc){
        Facture_Client fc=new Facture_Client();
        fc.lireFactureCAuClavier(sc);
        fc.setCommande(c);
        fc.setClient(cl);
        fc.calculerMontant();
        return fc;
        
    }
    public Transaction creerTransaction(Boutique b,Facture_Client fc,Scanner sc){
        Facture_Client f=new Facture_Client();
        Transaction tt=new Transaction(0,"","",f);
        seConnecter();
        if(isConnecte()){
        System.out.println("saisir le numero de transaction");
        int i=sc.nextInt();
        System.out.println("saisir le type de paiement");
        String t=sc.next();
        System.out.println("saisir la date de transaction");
        String d=sc.next();
        Transaction tr=new Transaction(i,t,d,fc);
        Client client = fc.getClient();
        boolean clientExists = false;
        for (Client c : b.getListClients()) { 
            if (c.equals(client)) {  
                clientExists = true;
                c.getListTransaction().add(tr); 
                break;
            }
        }
        if (!clientExists) {
            client.getListTransaction().add(tr);
            b.getListClients().add(client);
        }
        if(ouvrirCaisse()){
        fc.setPayee(true);
        caisse.addValCaisse(fc.getMontant());
        }
        fermerCaisse();
        return tr;
        }
        return tt;
    }
    @Override
    public void seConnecter(){
        if(connecte==false){
        Scanner sc=new Scanner(System.in);
        System.out.println("sasir votre nom d'utilisateur");
        String u=sc.next();
        System.out.println("sasir votre mot de passe");
        String p=sc.next();
        if (u.equals(username)&&p.equals(password)){
            System.out.println("VOUS ETES MAINTENANT CONNECTEE!");
            connecte=true;
        }
        else System.out.println("ECHEC D'AUTHENTIFICATIONN!!!");
        }
        else{
            System.out.println("vous etes deja connectee :)");
        }
    }
    @Override
    public void seDeconnecter(){
        connecte=false;
    }

    @Override
    public String toString() {
        return super.toString()+"  Caissier{" + "username=" + username + ", password=" + password + ", caisse=" + caisse + ", connecte=" + connecte + '}';
    }
    
}
