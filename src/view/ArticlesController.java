/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.converter.DoubleStringConverter;
import javafx.util.converter.IntegerStringConverter;
import model.Articles.Article;

/**
 * FXML Controller class
 *
 * @author PC
 */
public class ArticlesController implements Initializable {

    @FXML
    private VBox int4;
    @FXML
    private TableView<Article> tableview;
    @FXML
    private Button deletb;
    @FXML
    private TextField searchField;
    @FXML
    private Button searchButton;
    private ObservableList<Article> filteredData = FXCollections.observableArrayList();
    @FXML
    private TableColumn<Article, Integer> Code;
    @FXML
    private TableColumn<Article, String> libelle;
    @FXML
    private TableColumn<Article, Double> prixa;
    @FXML
    private TableColumn<Article, Double> prixv;
    @FXML
    private TableColumn<Article, Integer> stock;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tableview.setEditable(true);
        Code.setCellValueFactory(new PropertyValueFactory<>("codeArticle"));
        libelle.setCellValueFactory(new PropertyValueFactory<>("Nom"));
        prixa.setCellValueFactory(new PropertyValueFactory<>("prixa"));
        prixv.setCellValueFactory(new PropertyValueFactory<>("prixv"));
        stock.setCellValueFactory(new PropertyValueFactory<>("stock"));
        
        
        deletb.setOnAction(event -> {
        Article selectedArticle = tableview.getSelectionModel().getSelectedItem();
        if (selectedArticle != null) {
            BoutiqueVetements.getInstance().getArticleList().remove(selectedArticle);
        }
    });
        
        
        searchButton.setOnAction(event -> {
        String searchText = searchField.getText().toLowerCase();
        if (!searchText.isEmpty()) {
            filteredData.setAll(BoutiqueVetements.getInstance().getArticleList().filtered(article ->
                article.getNom().toLowerCase().contains(searchText)
            ));
            tableview.setItems(filteredData);
        } else {
            tableview.setItems(BoutiqueVetements.getInstance().getArticleList());
        }
    });
        
        
        
         
         
         
         
   
    Code.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
    Code.setOnEditCommit(event -> {Article article = event.getRowValue(); article.setCodeArticle(event.getNewValue());});
    libelle.setCellFactory(TextFieldTableCell.forTableColumn());
    libelle.setOnEditCommit(event -> {Article article = event.getRowValue(); article.setNom(event.getNewValue());});
    prixa.setCellFactory(TextFieldTableCell.forTableColumn(new DoubleStringConverter()));
    prixa.setOnEditCommit(event -> {Article article = event.getRowValue(); article.setPrixa(event.getNewValue());});
    prixv.setCellFactory(TextFieldTableCell.forTableColumn(new DoubleStringConverter()));
    prixv.setOnEditCommit(event -> {Article article = event.getRowValue(); article.setPrixv(event.getNewValue());});
    stock.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
    stock.setOnEditCommit(event -> {Article article = event.getRowValue(); article.setCodeArticle(event.getNewValue());});
    
    tableview.setItems(BoutiqueVetements.getInstance().getArticleList());
    }    

    @FXML
    private void clickedDec(ActionEvent event) {
          int4.getScene().getWindow().hide();
         try {
             Stage st =new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("Accueil.fxml"));
            Scene scene = new Scene(root,728,408);
            st.setTitle("Accueil");
            st.setScene(scene);
            
            st.show();
        } catch (IOException ex) {
            Logger.getLogger(BoutiqueVetements.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void clickedDash(ActionEvent event) {
          int4.getScene().getWindow().hide();
         try {
             Stage st =new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("AdminDashboard.fxml"));
            Scene scene = new Scene(root);
            st.setTitle("Admin Dashboard");
            st.setScene(scene);
            
            st.show();
        } catch (IOException ex) {
            Logger.getLogger(BoutiqueVetements.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void clickedQuit(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    private void clickedAjout(ActionEvent event) {
         try {
             Stage st =new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("AjoutArticle.fxml"));
            Scene scene = new Scene(root,400,400);
            st.setTitle("Ajout Article");
            st.setScene(scene);
            
            st.show();
        } catch (IOException ex) {
            Logger.getLogger(BoutiqueVetements.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
