/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnes;

/**
 *
 * @author PC
 */
import Articles.Boutique;
import java.util.ArrayList;
import java.util.Scanner;
public class Responsable_RH extends Employer implements Connectable{
    private ArrayList<Employer> listEmployer;
    private String username;
    private String password;
    private boolean connecte=false;

    public Responsable_RH(String username, String password, double salaire, String numCompteBanc, int id, String nom, String prenom, int numtel, String adresse, String email) {
        super(salaire, numCompteBanc, id, nom, prenom, numtel, adresse, email);
        this.username = username;
        this.password = password;
        listEmployer= new ArrayList<>();
    }

    
     public String getUsername() {
        if(connecte==true)
        return username;
        else return "Vous n'etes pas conectee!!!";
    }

    public void setUsername(String username) {
         if(connecte==true)
        this.username = username;
    }

    public String getPassword() {
        if(connecte==true)
        return password;
        else return "Vous n'etes pas conectee!!!";

    }

    public void setPassword(String password) {
        if(connecte==true)
        this.password = password;
        
    }

    public boolean isConnecte() {
        return connecte;
    }
    public void recruter(Boutique b,Employer e,Scanner sc){
        seConnecter();
        if(isConnecte()){
        double moy=0.0;
        System.out.println("donner une note sur 5 pour ses competences");
        moy+=sc.nextDouble();
        System.out.println("donner une note sur 5 pour ses experiences");
        moy+=sc.nextDouble();
        System.out.println("donner une note sur 5 pour la communication");
        moy+=sc.nextDouble();
        System.out.println("donner une note sur 5 pour son niveau d'etudes");
        moy+=sc.nextDouble();
        if(moy/4>=5){
            System.out.println("le candidat est qualifie pour la poste");
            listEmployer.add(e);
            b.getEmployers().add(e);
        }
        else System.out.println("le candidat n'est pas qualifie");
        }
    }
    @Override
    public void seConnecter(){
        if(connecte==false){
        Scanner sc=new Scanner(System.in);
        System.out.println("sasir votre nom d'utilisateur");
        String u=sc.next();
        System.out.println("sasir votre mot de passe");
        String p=sc.next();
        if (u.equals(username)&&p.equals(password)){
            System.out.println("VOUS ETES MAINTENANT CONNECTEE!");
            connecte=true;
        }
        else System.out.println("ECHEC D'AUTHENTIFICATIONN!!!");
        }
        else{
            System.out.println("vous etes deja connectee :)");
        }
    }
    @Override
    public void seDeconnecter(){
        connecte=false;
    }
    public void ajouterCaissierRemplacant(Boutique b) {
    seConnecter();
    if (isConnecte()) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Saisir le nom:");
        String nom = sc.next();

        System.out.println("Saisir le prénom:");
        String prenom = sc.next();

        System.out.println("Saisir l'ID:");
        int id = sc.nextInt();

        System.out.println("Saisir le username:");
        String username = sc.next();

        System.out.println("Saisir le password:");
        String password = sc.next();

        System.out.println("Saisir le salaire:");
        double salaire = sc.nextDouble();

        System.out.println("Saisir le numéro de compte bancaire:");
        String numCompteBanc = sc.next();

        System.out.println("Saisir le numéro de téléphone:");
        int numtel = sc.nextInt();

        System.out.println("Saisir l'adresse:");
        sc.nextLine(); // consume newline
        String adresse = sc.nextLine();

        System.out.println("Saisir l'email:");
        String email = sc.next();

        System.out.println("Saisir la date de début:");
        String datedF = sc.next();

        System.out.println("Saisir la date de fin:");
        String datefF = sc.next();
        Caissier caissierR = new Caissier(username, password, salaire, numCompteBanc, id, nom, prenom, numtel, adresse, email) {
            private String dated = datedF;
            private String datef = datefF;

            @Override
            public String getDated() {
                return dated;
            }

            @Override
            public String getDatef() {
                return datef;
            }
        };
        b.getEmployers().add(caissierR);
    }
}

    @Override
    public String toString(){
        return super.toString()+"Responsable_RH{" + "username=" + username + ", password=" + password + ", connecte=" + connecte + '}';
    }
}
