/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import model.Personnes.Employer;
import view.BoutiqueVetements;

/**
 * FXML Controller class
 *
 * @author PC
 */
public class AjoutEmployeController implements Initializable {

    @FXML
    private VBox int1;
    @FXML
    private TextField nomF;
    @FXML
    private TextField idF;
    @FXML
    private TextField ncbF;
    @FXML
    private TextField adrF;
    @FXML
    private TextField PrenomF;
    @FXML
    private TextField telF;
    @FXML
    private TextField salF;
    @FXML
    private TextField mailF;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void clickedValider(ActionEvent event) {
        try {
    Integer id = Integer.parseInt(idF.getText());
    String name = nomF.getText();
    String firstName = PrenomF.getText();
    Integer phone =Integer.parseInt( telF.getText());
    String account = ncbF.getText();
    Double salary =Double.parseDouble( salF.getText());
    String address = adrF.getText();
    String email = mailF.getText();
    Employer newEmployee = new Employer(salary, account, id, name, firstName, phone, address,email);
        BoutiqueVetements.getInstance().getEmployeeList().add(newEmployee);
        int1.getScene().getWindow().hide();
         } catch (NumberFormatException e) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Input Error");
        alert.setHeaderText("Invalid Number Format");
        alert.setContentText("Please ensure ID and phone number are integers, and salary is a valid number.");
        alert.showAndWait();
    }
    }
}
