/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.login;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author kjh27
 */
public class PrimaryController implements Initializable {

    @FXML
    private Button button1;
    @FXML
    private TextField inputUserID;
    @FXML
    private PasswordField inputPassword;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
           if(event.getSource() == button1){
            String username = inputUserID.getText();
            String password = inputPassword.getText();
            if(username.equalsIgnoreCase("Admin") && password.equalsIgnoreCase("admin")){
                System.out.println("Login success.");
                
                Stage primaryStage = new Stage();
                Parent root = FXMLLoader.load(getClass().getResource("secondary.fxml"));
                Scene scene = new Scene(root);
                primaryStage.setScene(scene);
                primaryStage.show();
                
                
            }else{
                System.out.println("Login failure.");
            }
        }
    }
    
}
