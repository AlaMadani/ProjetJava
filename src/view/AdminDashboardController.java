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
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author PC
 */
public class AdminDashboardController implements Initializable {

    @FXML
    private VBox int3;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void clickedVoirE(ActionEvent event) {
          int3.getScene().getWindow().hide();
         try {
             Stage st =new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("Employers.fxml"));
            Scene scene = new Scene(root);
            st.setTitle("Liste des employers");
            st.setScene(scene);
            
            st.show();
        } catch (IOException ex) {
            Logger.getLogger(BoutiqueVetements.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void clickedVoirArt(ActionEvent event) {
          int3.getScene().getWindow().hide();
         try {
             Stage st =new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("Articles.fxml"));
            Scene scene = new Scene(root);
            st.setTitle("Liste des articles");
            st.setScene(scene);
            
            st.show();
        } catch (IOException ex) {
            Logger.getLogger(BoutiqueVetements.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void clickedDec(ActionEvent event) {
          int3.getScene().getWindow().hide();
         try {
             Stage st =new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("Accueil.fxml"));
            Scene scene = new Scene(root);
            st.setTitle("Accueil");
            st.setScene(scene);
            
            st.show();
        } catch (IOException ex) {
            Logger.getLogger(BoutiqueVetements.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void clickedMyClients(ActionEvent event) {
          int3.getScene().getWindow().hide();
         try {
             Stage st =new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("Clients.fxml"));
            Scene scene = new Scene(root);
            st.setTitle("Liste des clients");
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
    private void clickedTrans(ActionEvent event) {
          int3.getScene().getWindow().hide();
         try {
             Stage st =new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("Transactions.fxml"));
            Scene scene = new Scene(root);
            st.setTitle("Liste des Transactions");
            st.setScene(scene);
            
            st.show();
        } catch (IOException ex) {
            Logger.getLogger(BoutiqueVetements.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }
    

