package com.company.glava17;
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;

public class CheckBoxDemo extends Application {
    CheckBox smart;
    CheckBox tablet;
    CheckBox note;
    CheckBox desk;

    Label response;
    Label selected;

    String computers;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) {
        stage.setTitle("Demonstrate Check Boxes");
        FlowPane rootNode = new FlowPane(Orientation.VERTICAL, 10, 10);
        rootNode.setAlignment(Pos.CENTER);
        Scene scene = new Scene(rootNode, 230, 200);
        stage.setScene(scene);
        Label heading = new Label("What computers do you own?");
        response = new Label("");
        selected = new Label("");

        smart = new CheckBox("Smartphone");
        tablet = new CheckBox("Tablet");
        note = new CheckBox("Notebook");
        desk = new CheckBox("Desktop");

        //Обработка событий действий для флажков
        smart.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (smart.isSelected())
                    response.setText("Smartphone was just selected.");
                else
                    response.setText("Smartphone was just cleared.");
                showAll();
            }
        });

        tablet.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (tablet.isSelected())
                    response.setText("Tablet was just selected.");
                else
                    response.setText("Tablet was just cleared.");
                showAll();
            }
        });

        note.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (note.isSelected())
                    response.setText("Notebook was just selected.");
                else
                    response.setText("Notebook was just cleared.");
                showAll();
            }
        });

        desk.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (desk.isSelected())
                    response.setText("Desktop was just selected.");
                else
                    response.setText("Desktop was just cleared.");
                showAll();
            }
        });

        rootNode.getChildren().addAll(heading, smart, tablet,
                note, desk, response, selected);
        stage.show();

        showAll();
    }

    void showAll() {
        computers = "";
        if(smart.isSelected()) computers = "Smartphone ";
        if(tablet.isSelected()) computers += "Tablet ";
        if(note.isSelected()) computers += "Notebook ";
        if(desk.isSelected()) computers += "Desktop";
        selected.setText("Computers selected: " + computers);
    }
}
