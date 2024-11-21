/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Accessoires;

/**
 *
 * @author PC
 */
public class Sac extends Accessoire{
    private int nbPoche;
    private String dimensions;
    private String categorie;
    private boolean impermeable;

    public Sac(int nbPoche, String dimensions, String categorie, boolean impermeable, String marque, int codeArticle, String nom, double prixa, double prixv, int stock) {
        super(marque, codeArticle, nom, prixa, prixv, stock);
        this.nbPoche = nbPoche;
        this.dimensions = dimensions;
        this.categorie = categorie;
        this.impermeable = impermeable;
    }

    public int getNbPoche() {
        return nbPoche;
    }

    public void setNbPoche(int nbPoche) {
        this.nbPoche = nbPoche;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public boolean isImpermeable() {
        return impermeable;
    }

    public void setImpermeable(boolean impermeable) {
        this.impermeable = impermeable;
    }
    
}
