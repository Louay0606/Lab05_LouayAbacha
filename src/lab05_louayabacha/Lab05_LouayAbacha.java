/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab05_louayabacha;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
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
        //GridPane
        GridPane aPane = new GridPane();
        aPane.setPadding(new Insets(10,10,10,10));
        
        TextField newItemField = new TextField();
        newItemField.setMinHeight(40);
        aPane.add(newItemField, 0, 0);
        aPane.setMargin(newItemField, new Insets(0,0,10,0));
        
        //create the buttons
        
        Button orderBtn = new Button("order now");
        Button clearBtn = new Button("Clear selection");
        orderBtn.setMinHeight(40);
        orderBtn.setMinWidth(120);
        clearBtn.setMinHeight(40);
        clearBtn.setMinWidth(120);
        HBox buttons = new HBox(10,orderBtn,clearBtn);
        
        aPane.add(buttons, 0, 2);
        //ListView 
        
        Label bagLabel = new Label("Select bag style!: ");
        ListView<String> bagList= new ListView<String>();
        String[] bags ={"Full Decorative","Beaded","Pirate Design","Fringed"
        ,"Leather","Plain"};
        
        bagList.setItems(FXCollections.observableArrayList(bags));
        bagList.setPrefWidth(Integer.MAX_VALUE);
        bagList.setPrefHeight(Integer.MAX_VALUE);
        
        aPane.add(bagList, 0, 0);
      
        //ComboBox 
        Label QuantityLabel = new Label("select the Quantity: ");
        aPane.add(QuantityLabel, 1, 0);
        ComboBox<String> quantityBox = new ComboBox<String>();
        quantityBox.getItems().addAll("1","2","3","4","5","6","7","8","9","10");
        quantityBox.setPromptText("Quantity");
        
        aPane.add(quantityBox, 0, 2);      
        
       //create RadioButtons
       Label sizeLabel = new Label("select a size");
       aPane.add(sizeLabel, 2, 0);
       RadioButton smallBtn = new RadioButton("SMALL");
       RadioButton mediumBtn = new RadioButton("Medium");
       RadioButton largeBtn = new RadioButton("Large");
       
       ToggleGroup sizes = new ToggleGroup();
       
       smallBtn.setToggleGroup(sizes);
       mediumBtn.setToggleGroup(sizes);
       largeBtn.setToggleGroup(sizes);
       
       VBox radioBtns = new VBox(5,smallBtn,mediumBtn,largeBtn);
       aPane.add(radioBtns, 2, 1);
    
       
       //Button actionss 
       Label messageLabel = new Label("");
       
      orderBtn.setOnAction((ActionEvent e)->{
        String selectedBag = bagList.getSelectionModel().getSelectedItem();
        String quantity = quantityBox.getSelectionModel().getSelectedItem();
        Object selectedSize = sizes.getSelectedToggle();
       
        messageLabel.setText("You ordered" +quantity + selectedSize+ selectedBag);
      } );  
        
      clearBtn.setOnAction((ActionEvent e) -> {
       bagList.getSelectionModel().clearSelection();
       quantityBox.setValue(null);
       sizes.selectToggle(null);
       messageLabel.setText("");
    
      } );
 
 
 
 
    
    
       
    
}
}