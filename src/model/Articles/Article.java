/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Articles;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Article {
    private int codeArticle;
    private String nom;
    private double prixa;
    private double prixv;
    private int stock;

    public Article(int codeArticle, String nom, double prixa, double prixv, int stock) {
        this.codeArticle = codeArticle;
        this.nom = nom;
        this.prixa = prixa;
        this.prixv = prixv;
        this.stock = stock;
    }
    public Article() {
    }
    public Article lireArticleAuClavier() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Saisir le code de l'article : ");
    int codeArticle = sc.nextInt();
    System.out.print("Saisir le nom de l'article : ");
    sc.nextLine();
    String nom = sc.nextLine();
    System.out.print("Saisir le prix d'achat : ");
    double prixa = sc.nextDouble();
    System.out.print("Saisir le prix de vente : ");
    double prixv = sc.nextDouble();
    System.out.print("Saisir le stock : ");
    int stock = sc.nextInt();
    return new Article(codeArticle, nom, prixa, prixv, stock);
}
    public int getCodeArticle() {
        return codeArticle;
    }

    public void setCodeArticle(int codeArticle) {
        this.codeArticle = codeArticle;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrixa() {
        return prixa;
    }

    public void setPrixa(double prixa) {
        this.prixa = prixa;
    }

    public double getPrixv() {
        return prixv;
    }

    public void setPrixv(double prixv) {
        this.prixv = prixv;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Article{" + "codeArticle=" + codeArticle + ", nom=" + nom + ", prixa=" + prixa + ", prixv=" + prixv + ", stock=" + stock + '}';
    }
    
}
