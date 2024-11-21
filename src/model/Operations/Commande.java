/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operations;

/**
 *
 * @author PC
 */
import Articles.Article;
import Articles.Boutique;
import Personnes.Client;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
public class Commande {
    private int numCommande;
    private HashMap<Article,Integer> articles;
    private String statut;///finalisee ou non
    public Commande(int numCommande, String statut) {
        this.numCommande = numCommande;
        this.statut = statut;
        articles=new HashMap<>();
    }

    public Commande() {
        articles=new HashMap<>();
    }
    
    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public int getNumCommande() {
        return numCommande;
    }


    public HashMap<Article,Integer> getArticles(){
        return articles;
    }
    public void ajouterArticle(Article a,int q){
        articles.put(a,q);  
    }
    public void suppArticle(Article a){
        articles.remove(a,articles.containsKey(a));
    }
   @Override
public String toString() {
    StringBuffer result = new StringBuffer();
    result.append("Numero commande: ").append(numCommande).append("\n");
    result.append("Articles: ");
    for (Map.Entry<Article, Integer> entry : articles.entrySet()) {
        Article article = entry.getKey();
        Integer quantity = entry.getValue();
        result.append(article.toString()).append(" (Quantity: ").append(quantity).append("), ");
    }
    if (!articles.isEmpty()) {
        result.setLength(result.length() - 2);
    }
    result.append("\nStatut: ").append(statut);
    
    return result.toString();
}
    public void lireCommandeAuClavier(Boutique b,Scanner sc){
        System.out.println("saisir le numero de commande");
        int num=sc.nextInt();
        System.out.println("saisir le statut de commande");
        String st=sc.next();
        this.numCommande=num;
        this.statut=st;
        int i=1;
        while(true){
            System.out.println("saisir l'article "+i);
            System.out.println("saisir l'id de l'article");
            int id=sc.nextInt();
             System.out.println("saisir la quantite");
            int q=sc.nextInt();
            for(Article a : b.getArticles()){
                if(a.getCodeArticle()==id){
                   articles.put(a,q);
                   a.setStock(a.getStock()-q);
                }
            }
           
            
            String ans;
            System.out.println("ajouter article? (y/n)");
            ans=sc.next();
            if(ans.equals("n")) break;
            i++;
            
        }
    }
}
