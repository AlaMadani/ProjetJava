/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package view;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author PC
 */
public class AjoutArticleController implements Initializable {

    @FXML
    private VBox int1;
    @FXML
    private ToggleGroup g1;
    @FXML
    private RadioButton radioStock;
    @FXML
    private RadioButton radioNew;
    @FXML
    private ComboBox<?> choiceBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        choiceBox.disableProperty().bind(radioStock.selectedProperty().not());
    }    

    @FXML
    private void clickedValider(ActionEvent event) {
        int1.getScene().getWindow().hide();
    }
    
}
