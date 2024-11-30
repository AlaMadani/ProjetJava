/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Accessoires;

import model.Articles.Article;

/**
 *
 * @author PC
 */
public sealed class Accessoire extends Article permits Lunette,Montre,Sac{
    private String marque;

    public Accessoire(String marque, int codeArticle, String nom, double prixa, double prixv, int stock) {
        super(codeArticle, nom, prixa, prixv, stock);
        this.marque = marque;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }
    
    
}
