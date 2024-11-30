/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Accessoires;

/**
 *
 * @author PC
 */
public final class Montre extends Accessoire{
    private String type;
    private boolean isSmart;
    private boolean impermeable;

    public Montre(String type, boolean isSmart, boolean impermeable, String marque, int codeArticle, String nom, double prixa, double prixv, int stock) {
        super(marque, codeArticle, nom, prixa, prixv, stock);
        this.type = type;
        this.isSmart = isSmart;
        this.impermeable = impermeable;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isIsSmart() {
        return isSmart;
    }

    public void setIsSmart(boolean isSmart) {
        this.isSmart = isSmart;
    }

    public boolean isImpermeable() {
        return impermeable;
    }

    public void setImpermeable(boolean impermeable) {
        this.impermeable = impermeable;
    }
    
}
