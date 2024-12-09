/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

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
import model.Operations.Facture_Client;
import view.BoutiqueVetements;

/**
 * FXML Controller class
 *
 * @author PC
 */
public class TransactionsController implements Initializable {

    @FXML
    private VBox int4;
    @FXML
    private TableView<Facture_Client> tableview;
    @FXML
    private Button deletb;
    @FXML
    private TextField searchField;
    @FXML
    private Button searchButton;
    private ObservableList<Facture_Client> filteredData = FXCollections.observableArrayList();
    @FXML
    private TableColumn<Facture_Client, Integer> numf;
    @FXML
    private TableColumn<Facture_Client, String> clientf;
    @FXML
    private TableColumn<Facture_Client, Integer> numcom;
    @FXML
    private TableColumn<Facture_Client, String> datef;
    @FXML
    private TableColumn<Facture_Client, Double> montf;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tableview.setEditable(true);
        numf.setCellValueFactory(new PropertyValueFactory<>("NumFact"));
        clientf.setCellValueFactory(new PropertyValueFactory<>("Nom"));
        numcom.setCellValueFactory(new PropertyValueFactory<>("NumCommande"));
        datef.setCellValueFactory(new PropertyValueFactory<>("DateFact"));
        montf.setCellValueFactory(new PropertyValueFactory<>("Montant"));
        
        
        deletb.setOnAction(event -> {
        Facture_Client selectedfact = tableview.getSelectionModel().getSelectedItem();
        if (selectedfact != null) {
            BoutiqueVetements.getInstance().getFactureList().remove(selectedfact);
        }
    });
        
        
        searchButton.setOnAction(event -> {
        String searchText = searchField.getText().toLowerCase();
        if (!searchText.isEmpty()) {
            filteredData.setAll(BoutiqueVetements.getInstance().getFactureList().filtered(Facture_Client ->
            Facture_Client.getNom().toLowerCase().contains(searchText)
            ));
            tableview.setItems(filteredData);
        } else {
            tableview.setItems(BoutiqueVetements.getInstance().getFactureList());
        }
    });
        
        
        
         
         
         
         
   
    clientf.setCellFactory(TextFieldTableCell.forTableColumn());
    clientf.setOnEditCommit(event -> {Facture_Client facture = event.getRowValue(); facture.setNom(event.getNewValue());});
    montf.setCellFactory(TextFieldTableCell.forTableColumn(new DoubleStringConverter()));
    montf.setOnEditCommit(event -> {Facture_Client facture = event.getRowValue(); facture.setMontant(event.getNewValue());});
    datef.setCellFactory(TextFieldTableCell.forTableColumn());
    datef.setOnEditCommit(event -> {Facture_Client facture = event.getRowValue(); facture.setDateFact(event.getNewValue());});
    
    tableview.setItems(BoutiqueVetements.getInstance().getFactureList());
    }    

    @FXML
    private void clickedDec(ActionEvent event) {
          int4.getScene().getWindow().hide();
         try {
             Stage st =new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("/view/Accueil.fxml"));
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
            Parent root = FXMLLoader.load(getClass().getResource("/view/AdminDashboard.fxml"));
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
            Parent root = FXMLLoader.load(getClass().getResource("/view/AjouterCommande.fxml"));
            Scene scene = new Scene(root,400,400);
            st.setTitle("Ajout Facture");
            st.setScene(scene);
            
            st.show();
        } catch (IOException ex) {
            Logger.getLogger(BoutiqueVetements.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
