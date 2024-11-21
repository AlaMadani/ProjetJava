/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Articles;

/**
 *
 * @author PC
 */
public class Vetement extends Article{
    private String tailles; ///       on peut cree enum
    private String matiere;
    private String sexe;
    private String saison;

    public Vetement(String taille, String matiere, String sexe, String saison, int codeArticle, String nom, double prixa, double prixv, int stock) {
        super(codeArticle, nom, prixa, prixv, stock);
        this.tailles = taille;
        this.matiere = matiere;
        this.sexe = sexe;
        this.saison = saison;
    }

    public String getTaille() {
        return tailles;
    }

    public void setTaille(String taille) {
        this.tailles = taille;
    }

    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getSaison() {
        return saison;
    }

    public void setSaison(String saison) {
        this.saison = saison;
    }

    @Override
    public String toString() {
        return super.toString()+"Vetement{" + "taille=" + tailles + ", matiere=" + matiere + ", sexe=" + sexe + ", saison=" + saison + '}';
    }

    
    
}
