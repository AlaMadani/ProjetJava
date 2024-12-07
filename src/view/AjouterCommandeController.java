/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package view;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import model.Operations.Commande;
import model.Operations.Facture_Client;
import model.Personnes.Client;

/**
 * FXML Controller class
 *
 * @author PC
 */
public class AjouterCommandeController implements Initializable {

    @FXML
    private VBox int1;
    @FXML
    private TextField nomf;
    @FXML
    private TextField numf;
    @FXML
    private TextField numc;
    @FXML
    private TextField montf;
    @FXML
    private DatePicker datef;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        datef.setValue(LocalDate.now());
    }    

    @FXML
    private void clickedValider(ActionEvent event) {
           try {
    Integer numrf = Integer.parseInt(numf.getText());
    String nom = nomf.getText();
    String date = datef.getValue() != null ? datef.getValue().toString() : "";
    Double montant =Double.parseDouble(montf.getText());
    Integer numec = Integer.parseInt(numc.getText());
    Client client=new Client(nom);
    Commande cmd=new Commande(numec);
    Facture_Client facture = new Facture_Client(client,numrf,date,cmd,montant);
        BoutiqueVetements.getInstance().getFactureList().add(facture);
        int1.getScene().getWindow().hide();
         } catch (NumberFormatException e) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Input Error");
        alert.setHeaderText("Invalid Inputs");
        alert.setContentText("Merci de verifier les donnees saisies.");
        alert.showAndWait();
    }
    }
    
}
