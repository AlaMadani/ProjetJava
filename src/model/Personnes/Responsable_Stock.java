/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnes;

/**
 *
 * @author PC
 */
import Articles.Article;
import Articles.Boutique;
import Articles.GestionStock;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Responsable_Stock extends Employer implements Connectable,GestionStock{
    private String username;
    private String password;
    private boolean connecte=false;
    private HashMap<Article,ArrayList<Fournisseur>> listFournisseur;

    public Responsable_Stock(String username, String password, double salaire, String numCompteBanc, int id, String nom, String prenom, int numtel, String adresse, String email) {
        super(salaire, numCompteBanc, id, nom, prenom, numtel, adresse, email);
        this.username = username;
        this.password = password;
        listFournisseur=new HashMap<>();
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
    public int getStock(Article a){
        return a.getStock();
    }
    public void ajouterStock(Article a,Integer b){////apparament yelzem parcours aal boutique
        seConnecter();
        if(isConnecte()){
        a.setStock(a.getStock()+b);
        }
    }
    public void ajouterFournisseur(Article a, Fournisseur f){
        seConnecter();
        if(isConnecte()){
        listFournisseur.get(a).add(f);
        }
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
    public void ajouterArticle(Boutique b,Article a) {
        b.getArticles().add(a);
    }

    @Override
public void suppArticle(Boutique b, Article a) {
    Iterator<Article> iterator = b.getArticles().iterator();
    while (iterator.hasNext()) {
        Article x = iterator.next();
        if (x.equals(a)) {
            iterator.remove();
            break;
        }
    }
}

    @Override
    public int verifierStock(Article a) {
       return a.getStock();
    }
    @Override
    public String toString() {
        return super.toString()+"Responsable_Stock{" + "username=" + username + ", password=" + password + ", connecte=" + connecte + '}';
    }
    
}
