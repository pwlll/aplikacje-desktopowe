package com.example.ksztalty;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.stage.Stage;

import java.io.IOException;

public class StarApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(StarApplication.class.getResource("hello-view.fxml"));
        Path path = new Path();

        MoveTo moveTo = new MoveTo(110, 70);

        LineTo line1 = new LineTo(321, 161);
        LineTo line2 = new LineTo(126,232);
        LineTo line3 = new LineTo(232,52);
        LineTo line4 = new LineTo(269, 250);
        LineTo line5 = new LineTo(108, 71);

        path.getElements().add(moveTo);
        path.getElements().addAll(line1, line2, line3, line4, line5);

        Circle circle = new Circle();
        circle.setCenterX(220);
        circle.setCenterY(150);
        circle.setRadius(35);
        circle.setFill(Color.BLACK);

        Group root = new Group(path,circle);

        Scene scene = new Scene(root, 600, 300);
        stage.setTitle("Gwiazda");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}