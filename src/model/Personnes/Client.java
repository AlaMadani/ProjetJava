/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Personnes;

/**
 *
 * @author PC
 */
import model.Operations.Transaction;
import java.util.ArrayList;
public final class Client extends Personne{
    private String typeClient;
    private ArrayList<Transaction> listTransaction;

    public Client(String typeClient,  int id, String nom, String prenom, int numtel, String adresse, String email) {
        super(id, nom, prenom, numtel, adresse, email);
        this.typeClient = typeClient;
        listTransaction=new ArrayList<>();
    }
    
    public Client(int id) {
        super(id);
        listTransaction=new ArrayList<>();
    }
    
    public String getTypeClient() {
        return typeClient;
    }

    public void setTypeClient(String typeClient) {
        this.typeClient = typeClient;
    }

    public ArrayList<Transaction> getListTransaction() {
        return listTransaction;
    }

    @Override
    public String toString() {
        return super.toString() + "typeClient=" + typeClient ;
    }
    
}
