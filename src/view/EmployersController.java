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
import model.Personnes.Employer;

/**
 * FXML Controller class
 *
 * @author PC
 */

public class EmployersController implements Initializable {

    @FXML
    private VBox int4;
    @FXML
    private TableView<Employer> tableview;
    @FXML
    private TableColumn<Employer,Integer> idColumn;
    @FXML
    private TableColumn<Employer,String> nameColumn;
    @FXML
    private TableColumn<Employer,String> prenomColumn;
    @FXML
    private TableColumn<Employer,Integer> telColumn;
    @FXML
    private TableColumn<Employer,String> cbColumn;
    @FXML
    private TableColumn<Employer,Double> salaireColumn;
    @FXML
    private TableColumn<Employer,String> adrColumn;
    @FXML
    private TableColumn<Employer,String> mailColumn;
    @FXML
    private Button deletb;
    @FXML
    private TextField searchField;
    @FXML
    private Button searchButton;
    @FXML
    private ObservableList<Employer> filteredData = FXCollections.observableArrayList();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tableview.setEditable(true);
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("Nom"));
        prenomColumn.setCellValueFactory(new PropertyValueFactory<>("Prenom"));
        telColumn.setCellValueFactory(new PropertyValueFactory<>("Numtel"));
        cbColumn.setCellValueFactory(new PropertyValueFactory<>("NumCompteBanc"));
        salaireColumn.setCellValueFactory(new PropertyValueFactory<>("Salaire"));
        adrColumn.setCellValueFactory(new PropertyValueFactory<>("Adresse"));
        mailColumn.setCellValueFactory(new PropertyValueFactory<>("Email"));
        
        
        deletb.setOnAction(event -> {
        Employer selectedEmployer = tableview.getSelectionModel().getSelectedItem();
        if (selectedEmployer != null) {
            BoutiqueVetements.getInstance().getEmployeeList().remove(selectedEmployer);
        }
    });
        
        
        searchButton.setOnAction(event -> {
        String searchText = searchField.getText().toLowerCase();
        if (!searchText.isEmpty()) {
            filteredData.setAll(BoutiqueVetements.getInstance().getEmployeeList().filtered(employer ->
                employer.getPrenom().toLowerCase().contains(searchText)
            ));
            tableview.setItems(filteredData);
        } else {
            tableview.setItems(BoutiqueVetements.getInstance().getEmployeeList());
        }
    });
        
        
        
         
         
         
         
    nameColumn.setCellFactory(TextFieldTableCell.forTableColumn());
    nameColumn.setOnEditCommit(event -> {Employer employer = event.getRowValue(); employer.setNom(event.getNewValue());});
    prenomColumn.setCellFactory(TextFieldTableCell.forTableColumn());
    prenomColumn.setOnEditCommit(event -> {Employer employer = event.getRowValue(); employer.setPrenom(event.getNewValue());});
    telColumn.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
    telColumn.setOnEditCommit(event -> {Employer employer = event.getRowValue(); employer.setNumtel(event.getNewValue());});
    cbColumn.setCellFactory(TextFieldTableCell.forTableColumn());
    cbColumn.setOnEditCommit(event -> {Employer employer = event.getRowValue(); employer.setNumCompteBanc(event.getNewValue());});
    salaireColumn.setCellFactory(TextFieldTableCell.forTableColumn(new DoubleStringConverter()));
    salaireColumn.setOnEditCommit(event -> {Employer employer = event.getRowValue(); employer.setSalaire(event.getNewValue());});
    adrColumn.setCellFactory(TextFieldTableCell.forTableColumn());
    adrColumn.setOnEditCommit(event -> {Employer employer = event.getRowValue(); employer.setAdresse(event.getNewValue());});
    mailColumn.setCellFactory(TextFieldTableCell.forTableColumn());
    mailColumn.setOnEditCommit(event -> {Employer employer = event.getRowValue(); employer.setEmail(event.getNewValue());});
    
    
    tableview.setItems(BoutiqueVetements.getInstance().getEmployeeList());
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
            Parent root = FXMLLoader.load(getClass().getResource("AjoutEmploye.fxml"));
            Scene scene = new Scene(root,400,400);
            st.setTitle("Admin Dashboard");
            st.setScene(scene);
            
            st.show();
        } catch (IOException ex) {
            Logger.getLogger(BoutiqueVetements.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
