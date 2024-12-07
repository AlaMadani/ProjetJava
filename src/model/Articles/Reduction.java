/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package model.Articles;

import java.time.LocalDate;

/**
 *
 * @author harbaoui
 */
public record Reduction(String code, double pourcentage, LocalDate dateDebut, LocalDate dateFin) implements CalculReduction  {
    
    public boolean estValide()
    {
        LocalDate aujourdHui = LocalDate.now();
        return !aujourdHui.isBefore(dateDebut) && !aujourdHui.isAfter(dateFin);
    }
    @Override 
    public double appliquer(double prixOriginla)
    {
         CalculReduction calculReduction = prix -> prix * (1 - pourcentage / 100);
        return appliquer(prixOriginla) ;
    }

}
