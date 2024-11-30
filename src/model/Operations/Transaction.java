/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Operations;

/**
 *
 * @author PC
 */
public record Transaction(int numTrans,String typePaiement, String date, Facture_Client facture) {}
