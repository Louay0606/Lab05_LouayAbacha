/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab05_louayabacha;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author 6313901
 */
public class Lab05_LouayAbacha extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        GridPane aPane = new GridPane();
        aPane.setPadding(new Insets(10,10,10,10));
        
        TextField newItemField = new TextField();
        newItemField.setMinHeight(40);
        aPane.add(newItemField, 0, 0);
        aPane.setMargin(newItemField, new Insets(0,0,10,0));
        
        //create the buttons
        
        Button orderBtn = new Button("order now");
        Button clearBtn = new Button("Clear selection");
        
        
    }
       
    
}
