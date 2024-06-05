/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.login;

import java.net.URL;
import javafx.util.Duration;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import javafx.animation.ScaleTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import com.jfoenix.controls.JFXTextArea;


/**
 * FXML Controller class
 *
 * @author kjh27
 */
public class SecondaryController implements Initializable {


    @FXML
    private ImageView movie1;
    
    @FXML
    private Pane movieanch1;
    
    @FXML
    private Pane slider1;
    
    @FXML
    private ImageView movie2;
    
    @FXML
    private Pane movieanch2;
    
    @FXML
    private Pane slider2;
    
        @FXML
    private ImageView movie3;
    
    @FXML
    private Pane movieanch3;
    
    @FXML
    private Pane slider3;
    
            @FXML
    private ImageView movie4;
    
    @FXML
    private Pane movieanch4;
    
    @FXML
    private Pane slider4;
    
    @FXML
    private JFXTextArea moviedescrip1;
    
    @FXML
    private JFXTextArea moviedescrip2;
        @FXML
    private JFXTextArea moviedescrip3;
                @FXML
    private JFXTextArea moviedescrip4;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        moviedescrip1.setStyle("-fx-text-inner-color: #d4d4d4");
        moviedescrip2.setStyle("-fx-text-inner-color: #d4d4d4");
        moviedescrip3.setStyle("-fx-text-inner-color: #d4d4d4");
        moviedescrip4.setStyle("-fx-text-inner-color: #d4d4d4");
        
        
        ScaleTransition scaleIn = new ScaleTransition(Duration.seconds(0.5), movie1);
        scaleIn.setToX(1.2);
        scaleIn.setToY(1.2);
        
        ScaleTransition scaleOut = new ScaleTransition(Duration.seconds(0.5), movie1);
        scaleOut.setToX(1);
        scaleOut.setToY(1);
        
        ScaleTransition scaleIn2 = new ScaleTransition(Duration.seconds(0.5), movie2);
        scaleIn2.setToX(1.2);
        scaleIn2.setToY(1.2);
        
        ScaleTransition scaleOut2 = new ScaleTransition(Duration.seconds(0.5), movie2);
        scaleOut2.setToX(1);
        scaleOut2.setToY(1);
        
                ScaleTransition scaleIn3 = new ScaleTransition(Duration.seconds(0.5), movie3);
        scaleIn3.setToX(1.2);
        scaleIn3.setToY(1.2);
        
        ScaleTransition scaleOut3 = new ScaleTransition(Duration.seconds(0.5), movie3);
        scaleOut3.setToX(1);
        scaleOut3.setToY(1);
        
        ScaleTransition scaleIn4 = new ScaleTransition(Duration.seconds(0.5), movie4);
        scaleIn4.setToX(1.2);
        scaleIn4.setToY(1.2);
        
        ScaleTransition scaleOut4 = new ScaleTransition(Duration.seconds(0.5), movie4);
        scaleOut4.setToX(1);
        scaleOut4.setToY(1);
        
         slider1.setOpacity(0);
        FadeTransition fadeIn = new FadeTransition(Duration.seconds(0.5), slider1);
        fadeIn.setToValue(1);

        FadeTransition fadeOut = new FadeTransition(Duration.seconds(0.5), slider1);
        fadeOut.setToValue(0);
        
        slider2.setOpacity(0);
        FadeTransition fadeIn2 = new FadeTransition(Duration.seconds(0.5), slider2);
        fadeIn2.setToValue(1);

        FadeTransition fadeOut2 = new FadeTransition(Duration.seconds(0.5), slider2);
        fadeOut2.setToValue(0);
        
        slider3.setOpacity(0);
        FadeTransition fadeIn3 = new FadeTransition(Duration.seconds(0.5), slider3);
        fadeIn3.setToValue(1);

        FadeTransition fadeOut3 = new FadeTransition(Duration.seconds(0.5), slider3);
        fadeOut3.setToValue(0);
        
                slider4.setOpacity(0);
        FadeTransition fadeIn4 = new FadeTransition(Duration.seconds(0.5), slider4);
        fadeIn4.setToValue(1);

        FadeTransition fadeOut4 = new FadeTransition(Duration.seconds(0.5), slider4);
        fadeOut4.setToValue(0);
        
        
        movie1.setOnMouseEntered(event -> {
            scaleIn.play(); // 확대 애니메이션 재생
            fadeIn.play(); 

        });
             
        movieanch1.setOnMouseExited(event -> {
            scaleOut.play(); // 확대 애니메이션 재생
            fadeOut.play(); 
        });
        
                movie2.setOnMouseEntered(event -> {
            scaleIn2.play(); // 확대 애니메이션 재생
            fadeIn2.play(); 

        });
             
        movieanch2.setOnMouseExited(event -> {
            scaleOut2.play(); // 확대 애니메이션 재생
            fadeOut2.play(); 
        });
        
        movie3.setOnMouseEntered(event -> {
            scaleIn3.play(); // 확대 애니메이션 재생
            fadeIn3.play(); 

        });
             
        movieanch3.setOnMouseExited(event -> {
            scaleOut3.play(); // 확대 애니메이션 재생
            fadeOut3.play(); 
        });
        
        movie4.setOnMouseEntered(event -> {
            scaleIn4.play(); // 확대 애니메이션 재생
            fadeIn4.play(); 

        });
             
        movieanch4.setOnMouseExited(event -> {
            scaleOut4.play(); // 확대 애니메이션 재생
            fadeOut4.play(); 
        });
     
    }    
    
}
