/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Operations;

/**
 *
 * @author PC
 */
public class Caisse {
    private int numCaisse;
    private double valCaisse;
    private String statut;
    private boolean lecteurCarteB;

    public Caisse(int numCaisse) {
        this.numCaisse = numCaisse;
        this.valCaisse=0.0;
        this.statut="fermee";
    }

    public double getValCaisse() {
        return valCaisse;
    }

    public void setValCaisse(double valCaisse)throws ExceptionValeurInvalide{
        if(valCaisse<0){
            throw new ExceptionValeurInvalide("la valeur de la caisse doit etre positive!!!");
        }
        this.valCaisse = valCaisse;
    }
    public void addValCaisse(double v){
        this.valCaisse+=v;
    }
    public int getNumCaisse() {
        return numCaisse;
    }

    public void setNumCaisse(int numCaisse) {
        this.numCaisse = numCaisse;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public boolean isLecteurCarteB() {
        return lecteurCarteB;
    }

    public void setLecteurCarteB(boolean lecteurCarteB) {
        this.lecteurCarteB = lecteurCarteB;
    }    
    @Override
    public String toString(){
        return "numero caisse : "+numCaisse+" statut : "+statut+" equipee d'un lecteur carte bancaire?: "+lecteurCarteB;
    }
}
