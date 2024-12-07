/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package view;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Articles.Article;
import model.Operations.Facture_Client;
import model.Personnes.Employer;

/**
 *
 * @author PC
 */
public class BoutiqueVetements extends Application {
    private static BoutiqueVetements instance;
     public BoutiqueVetements() {
        instance = this;
    }

    public static BoutiqueVetements getInstance() {
        return instance;
    }
    
    private ObservableList<Employer> employeeList = FXCollections.observableArrayList();

public ObservableList<Employer> getEmployeeList() {
    return employeeList;
}

 private ObservableList<Article> ArticleList = FXCollections.observableArrayList();

public ObservableList<Article> getArticleList() {
    return ArticleList;
}

private ObservableList<Facture_Client> FactureList = FXCollections.observableArrayList();

public ObservableList<Facture_Client> getFactureList() {
    return FactureList;
}

    
    @Override
    public void start(Stage stage){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Accueil.fxml"));
            
            Scene scene = new Scene(root,728,408);
            stage.setTitle("Accueil");
            stage.setScene(scene);
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(BoutiqueVetements.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
