/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Accessoires;

/**
 *
 * @author PC
 */
public final class Lunette extends Accessoire{
    private boolean protectionUV;
    private String materiau;
    private String couleur;

    public Lunette(boolean protectionUV, String materiau, String couleur, String marque, int codeArticle, String nom, double prixa, double prixv, int stock) {
        super(marque, codeArticle, nom, prixa, prixv, stock);
        this.protectionUV = protectionUV;
        this.materiau = materiau;
        this.couleur = couleur;
    }

    public boolean isProtectionUV() {
        return protectionUV;
    }

    public void setProtectionUV(boolean protectionUV) {
        this.protectionUV = protectionUV;
    }

    public String getMateriau() {
        return materiau;
    }

    public void setMateriau(String materiau) {
        this.materiau = materiau;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
    
}
