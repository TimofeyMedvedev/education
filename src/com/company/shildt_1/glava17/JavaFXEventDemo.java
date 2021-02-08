package com.company.glava17;
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;

public class JavaFXEventDemo extends Application {
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
        Button up = new Button("Up");
        Button down = new Button("Down");

        //Обработать события действий для кнопки Up
        up.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                response.setText("You pressed Up.");
            }
        });

        down.setOnAction((ae) -> response.setText("You pressed Down."));

        rootNode.getChildren().addAll(up, down, response);
        stage.show();
    }
}
