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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import view.BoutiqueVetements;

/**
 * FXML Controller class
 *
 * @author PC
 */
public class AccueilController implements Initializable {

    @FXML
    private ComboBox<String> choiceBox = new ComboBox<>();
    
    @FXML
    private StackPane int1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        choiceBox.getItems().addAll("ADMINISTRATEUR", "Caissier", "Responsable Stock");
    }   
    public String getValueCbox(){
        return choiceBox.getValue();
    }

    @FXML
    private void clickedConn(ActionEvent event) {
        int1.getScene().getWindow().hide();
         try {
             Stage st =new Stage();
             FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Connexion.fxml"));
             Parent root = loader.load();
            Scene scene = new Scene(root,600,330);
            st.setTitle("Connexion");
            st.setScene(scene);
            ConnexionController secondController = loader.getController();
        String selectedValue = choiceBox.getValue();
            secondController.setPoste(selectedValue);
            st.show();
        } catch (IOException ex) {
            Logger.getLogger(BoutiqueVetements.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
