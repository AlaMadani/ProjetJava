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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author PC
 */
public class ConnexionController implements Initializable {

    @FXML
    private Label poste;
    @FXML
    private VBox int2;
    @FXML
    private TextField user;
    @FXML
    private PasswordField pwd;
    public void setPoste(String p){
        poste.setText(p);
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void clickedlogin(ActionEvent event) {
        String str="";
        if(poste.getText().equals("ADMINISTRATEUR") && user.getText().equals("admin") && pwd.getText().equals("admin")){
            str="AdminDashboard.fxml";
        }
        else if(poste.getText().equals("Responsable Stock")  && user.getText().equals("stock") && pwd.getText().equals("stock")){
              str="ResponsableStockDashboard.fxml";
        }
        else if(poste.getText().equals("Caissier")  && user.getText().equals("caissier") && pwd.getText().equals("caissier")) {
            str="CaissierDashboard.fxml";
        }
        else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Input Error");
        alert.setHeaderText("Invalid Inputs");
        alert.setContentText("le nom d'utilisateur et/ou mot de passe est/sont incorrecte(s)");
        alert.showAndWait();
        return;
        }
         int2.getScene().getWindow().hide();
         try {
             Stage st =new Stage();
            Parent root = FXMLLoader.load(getClass().getResource(str));
            Scene scene = new Scene(root);
            st.setTitle("Admin Dashboard");
            st.setScene(scene);
            
            st.show();
        } catch (IOException ex) {
            Logger.getLogger(BoutiqueVetements.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void clickedPrev(ActionEvent event) {
         int2.getScene().getWindow().hide();
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
    private void clickedCancel(ActionEvent event) {
        Platform.exit();
    }
    
}
