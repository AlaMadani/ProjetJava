/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Personnes;

import model.Accessoires.Montre;
import model.Articles.Boutique;
import model.Articles.Chaussure;
import model.Articles.Vetement;
import model.Operations.Caisse;
import model.Operations.Commande;
import model.Operations.Facture_Client;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Boutique b= new Boutique("LC WAIKIKI","BIZERTE, CITE HSSAN NOURI",72455869);
        Responsable_Stock rs = new Responsable_Stock("ala","123456",1000,"089663514",111,"Ala Eddine","Madani",26380131,"bizerte","alemedeni0@gmail.com");
        Responsable_RH rh=new Responsable_RH("aymen","4512",950,"9855562k251",211,"Aymen","ben aouicha",97566325,"tunis","aymen@gmail.com");
        Caissier ca =new Caissier("salah","0000",1200,"5641543854",311,"Salah","Ben Salah",54226325,"ariana","salah@gmail.com");
        Caisse caiss=new Caisse(8);
        ca.setCaisse(caiss);
        Chaussure c=new Chaussure(47,"sport","Adidas",145,"Adidas Casual-556",120,160,30);
        Vetement v=new Vetement("S,M,L,XL,XXL","Cotton 100%","H/F","Hiver",899,"Capuche",20,36,48);
        Montre m=new Montre("Numerique",true,false,"Quartz",655,"Quartz Smart Watch",40,75,18);
        b.ajouterEmployer(rh);
        
        rh.recruter(b, rs, sc);
        rh.recruter(b, ca, sc);
        System.out.println(b);
        rs.ajouterArticle(b, m);
        rs.ajouterArticle(b, c);
        rs.ajouterArticle(b, v);
        System.out.println(b);
        Commande com=ca.creerCommande(b, sc);
        Client cl=new Client("physique",11446752,"hamadi","ben mohamed",23130766,"AVENUE10MARS","HAMADI@gmail.com");
        Facture_Client fc=ca.creerFactureC(b, com, cl, sc);
        ca.creerTransaction(b, fc, sc);
        System.out.println("***************************************************");
        System.out.println(b);
        
        
    }
}