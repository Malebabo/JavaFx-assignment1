package com.example.demo3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class HelloController {

    //declarations
    @FXML
    public MenuButton allCountries;
    public Button argentinaMain;
    public Button armeniaMain;
    public Button austriaMain;
    public Button bulgariaMain;
    public Button boliviaMain;
    public Pane pane1;
    public Pane pane2;
    public Pane pane3;
    public MenuItem Argentina;
    public MenuItem Armenia;
    public MenuItem Austria;
    public MenuItem Bolivia;
    public MenuItem Bulgaria;
    public MenuItem ElSalvador;
    public MenuItem Estonia;
    public MenuItem Gabon;
    public MenuItem Germany;
    public MenuItem Handuray;
    public MenuItem Hungary;
    public MenuItem Lesotho;
    public MenuItem Russia;

    @FXML
    private Button exit;

    //function to show different flags, by changing pane colors
    public void showFlag(ActionEvent ev){
        if(ev.getSource()==argentinaMain || ev.getSource()==Argentina){
            pane1.setStyle("-fx-background-color: #7ec0ee");
            pane2.setStyle("-fx-background-color: white");
            pane3.setStyle("-fx-background-color: #7ec0ee");
        }
        else if(ev.getSource()==armeniaMain || ev.getSource()==Armenia){
            pane1.setStyle("-fx-background-color: #D10000");
            pane2.setStyle("-fx-background-color: #051094");
            pane3.setStyle("-fx-background-color: #EC9706");
        }
        else if(ev.getSource()==austriaMain || ev.getSource()==Austria){
            pane1.setStyle("-fx-background-color: #DC143C");
            pane2.setStyle("-fx-background-color: white");
            pane3.setStyle("-fx-background-color: #DC143C");
        }
        else if(ev.getSource()==boliviaMain || ev.getSource()==Bolivia){
            pane1.setStyle("-fx-background-color: #D9381E");
            pane2.setStyle("-fx-background-color: #FFEA00");
            pane3.setStyle("-fx-background-color: #005C29");
        }
        else if(ev.getSource()==bulgariaMain || ev.getSource()==Bulgaria){
            pane1.setStyle("-fx-background-color: white");
            pane2.setStyle("-fx-background-color: #3DB489");
            pane3.setStyle("-fx-background-color: #D9381E");
        }
        else if(ev.getSource()==ElSalvador){
            pane1.setStyle("-fx-background-color: #0F4D92");
            pane2.setStyle("-fx-background-color: white");
            pane3.setStyle("-fx-background-color: #0F4D92");
        }
        else if(ev.getSource()==Estonia){
            pane1.setStyle("-fx-background-color: #0072BB");
            pane2.setStyle("-fx-background-color: black");
            pane3.setStyle("-fx-background-color: white");
        }
        else if(ev.getSource()==Gabon){
            pane1.setStyle("-fx-background-color: #5DBB63");
            pane2.setStyle("-fx-background-color: #FFEA00");
            pane3.setStyle("-fx-background-color: #006DB0");
        }
        else if(ev.getSource()==Germany){
            pane1.setStyle("-fx-background-color: #000000");
            pane2.setStyle("-fx-background-color: #D10000");
            pane3.setStyle("-fx-background-color: #FFDF00");
        }
        else if(ev.getSource()==Handuray){
            pane1.setStyle("-fx-background-color: #008ECC");
            pane2.setStyle("-fx-background-color: white");
            pane3.setStyle("-fx-background-color: #008ECC");
        }
        else if(ev.getSource()==Hungary){
            pane1.setStyle("-fx-background-color: #D10000");
            pane2.setStyle("-fx-background-color: white");
            pane3.setStyle("-fx-background-color: #009150");
        }
        else if(ev.getSource()==Lesotho){
            pane1.setStyle("-fx-background-color: #1520A6");
            pane2.setStyle("-fx-background-color: white");
            pane3.setStyle("-fx-background-color: #228C22");
        }
        else if(ev.getSource()==Russia){
            pane1.setStyle("-fx-background-color: WHITE");
            pane2.setStyle("-fx-background-color: #1520A6");
            pane3.setStyle("-fx-background-color: #D10000");
        }
    }

    //function to clear the selected flag
    public void refresh(ActionEvent ev){
        pane1.setStyle("-fx-background-color: transparent");
        pane2.setStyle("-fx-background-color: transparent");
        pane3.setStyle("-fx-background-color: transparent");

    }

    public void  Close(ActionEvent act) {//function to exit

        //creating an alert box to confirm exiting
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Exit");
        alert.setHeaderText("Exiting will clear all selected data");
        alert.setContentText("Are you sure you want to exit?");

        if (alert.showAndWait().get() == ButtonType.OK) {
            Stage stage = (Stage) exit.getScene().getWindow();
            stage.close();
        }
    }
}