/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Articles;

/**
 *
 * @author PC
 */
public class Chaussure extends Article{
    private double pointure;
    private String categorie;
    private String marque;

    public Chaussure(double pointure, String categorie, String marque, int codeArticle, String nom, double prixa, double prixv, int stock) {
        super(codeArticle, nom, prixa, prixv, stock);
        this.pointure = pointure;
        this.categorie = categorie;
        this.marque = marque;
    }

    public double getPointure() {
        return pointure;
    }

    public void setPointure(double pointure) {
        this.pointure = pointure;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    @Override
    public String toString() {
        return super.toString()+"Chaussure{" + "pointure=" + pointure + ", categorie=" + categorie + ", marque=" + marque + '}';
    }
    
}
