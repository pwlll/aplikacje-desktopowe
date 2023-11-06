package com.example.login;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Label nLabel = new Label("Nazwa:");
        TextField nField = new TextField();

        Label pLabel = new Label("Hasło:");
        PasswordField pField = new PasswordField();

        GridPane gridPane = new GridPane();
        gridPane.setHgap(2);
        gridPane.setVgap(2);
        gridPane.setAlignment(javafx.geometry.Pos.CENTER);
        
        gridPane.add(nLabel, 0, 0);
        gridPane.add(nField, 1, 0);
        gridPane.add(pLabel, 0, 1);
        gridPane.add(pField, 1, 1);

        Button sButton=new Button("Wyślij");
        gridPane.add(sButton, 1, 2);
        Button cButton=new Button("Wyczyść");
        cButton.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                nField.setText("");
                pField.setText("");
            }
        });
        gridPane.add(cButton,2,2);
        Scene scene = new Scene(gridPane, Screen.getPrimary().getVisualBounds().getWidth()*0.7, Screen.getPrimary().getVisualBounds().getHeight()*0.7);
        stage.setTitle("Login form");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}