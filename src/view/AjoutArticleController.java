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
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import model.Articles.Article;
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
    @FXML
    private TextField codef;
    @FXML
    private TextField prixaf;
    @FXML
    private TextField stockf;
    @FXML
    private TextField libf;
    @FXML
    private TextField prixvf;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        choiceBox.disableProperty().bind(radioStock.selectedProperty().not());
    }    

    @FXML
    private void clickedValider(ActionEvent event) {
         try {
    Integer code = Integer.parseInt(codef.getText());
    String lib = libf.getText();
    Double prixa =Double.parseDouble(prixaf.getText());
    Double prixv =Double.parseDouble(prixvf.getText());
    Integer stk = Integer.parseInt(stockf.getText());
    Article article = new Article(code,lib,prixa,prixv,stk);
        BoutiqueVetements.getInstance().getArticleList().add(article);
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
