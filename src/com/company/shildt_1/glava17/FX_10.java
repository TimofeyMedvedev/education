package com.company.glava17;
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;

public class FX_10 extends Application {
    Label response;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) {
        stage.setTitle("Use JavaFX Buttons and Events");
        FlowPane rootNode = new FlowPane(10, 10);
        rootNode.setAlignment(Pos.CENTER);
        Scene scene = new Scene(rootNode, 300, 100);
        stage.setScene(scene);
        response = new Label("Push a Button");
        Button up = new Button("Run");
        Button down = new Button("Exit");

        //Обработать события действий для кнопки Up
        up.setOnAction((ae) -> response.setText("You pressed Run."));

        down.setOnAction((ae) -> Platform.exit());

        rootNode.getChildren().addAll(up, down, response);
        stage.show();
    }
}