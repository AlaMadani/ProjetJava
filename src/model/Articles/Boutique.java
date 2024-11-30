/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Articles;

import model.Personnes.Client;
import model.Personnes.Employer;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class Boutique implements GestionStock{
    private String nom;
    private ArrayList<Article> articles;
    private String adresse;
    private int numtel;
    private ArrayList<Employer> employers;
    private ArrayList<Client> listClients;
    public Boutique(String nom, String adresse, int numtel) {
        this.nom = nom;
        this.adresse = adresse;
        this.numtel = numtel;
        employers=new ArrayList<>();
        listClients=new ArrayList<>();
        articles=new ArrayList<>();
    }
    
    public String getNom() {
        return nom;
    }

    public ArrayList<Client> getListClients() {
        return listClients;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getNumtel() {
        return numtel;
    }

    public void setNumtel(int numtel) {
        this.numtel = numtel;
    }

    public ArrayList<Article> getArticles() {
        return articles;
    }

    public ArrayList<Employer> getEmployers() {
        return employers;
    }
    public void ajouterEmployer(Employer e){
        employers.add(e);
    }

    @Override
    public void ajouterArticle(Boutique b,Article a) {
        articles.add(a);
    }

    @Override
    public void suppArticle(Boutique b,Article a) {
      articles.remove(a);
    }

    @Override
    public int verifierStock(Article a) {
       return a.getStock();
    }
    @Override
public String toString() {
    StringBuffer sb = new StringBuffer();
    sb.append("Nom de la boutique: ").append(nom).append("\n");
    sb.append("Addresse: ").append(adresse).append("\n");
    sb.append("Numero de telephone: ").append(numtel).append("\n");

    sb.append("Articles: ");
    if (articles.isEmpty()) {
        sb.append("Aucun Articles\n");
    } else {
        for (Article article : articles) {
            sb.append("\n  - ").append(article.toString());
        }
    }

    sb.append("\nEmployers: ");
    if (employers.isEmpty()) {
        sb.append("Aucun Employers\n");
    } else {
        for (Employer employer : employers) {
            sb.append("\n  - ").append(employer.toString());
        }
    }
    
    sb.append("\nClients: ");
    if (listClients.isEmpty()) {
        sb.append("Aucun Clients\n");
    } else {
        for (Client client : listClients) {
            sb.append("\n  - ").append(client.toString());
        }
    }
    return sb.toString();
}
}
