/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model.Articles;

/**
 *
 * @author PC
 */
public interface GestionStock {
    public void ajouterArticle(Boutique b,Article a);
    public void suppArticle(Boutique b,Article a);
    public int verifierStock(Article a);
}
