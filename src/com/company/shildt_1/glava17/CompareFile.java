package com.company.glava17;
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;
import java.io.FileInputStream;
import java.io.IOException;

public class CompareFile extends Application {
    TextField tf1;
    TextField tf2;
    Button btComp;
    Label lb;
    CheckBox cb;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) {
        stage.setTitle("Compare Files");
        FlowPane rootNode = new FlowPane(10, 10);
        rootNode.setAlignment(Pos.CENTER);
        Scene scene = new Scene(rootNode, 230, 140);
        stage.setScene(scene);
        lb = new Label("");
        btComp = new Button("Compare");
        cb = new CheckBox("Show position of mismatch");
        tf1 = new TextField();
        tf2 = new TextField();
        //Задать подсказку
        tf1.setPromptText("Enter a filename #1.");
        tf2.setPromptText("Enter a filename #2.");
        //Задать предпочтительное количество столбцов
        tf1.setPrefColumnCount(15);
        tf2.setPrefColumnCount(15);
        tf1.setOnAction((ae) -> btComp.fire());
        tf2.setOnAction((ae) -> btComp.fire());
        btComp.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                int i = 0, j = 0;
                int count = 0;
                // Сначала убедиться в том, что введены имена обоих файлов
                if(tf1.getText().equals("")) {
                    lb.setText("First file name missing.");
                    return;
                }
                if(tf2.getText().equals("")) {
                    lb.setText("Second file name missing.");
                    return;
                }
                // Сравнить файлы, используя оператор try с ресурсами
                try(FileInputStream f1 = new FileInputStream(tf1.getText());
                    FileInputStream f2 = new FileInputStream(tf2.getText())) {
                    do {
                        i = f1.read();
                        j = f2.read();
                        count++;
                        if (i != j) break;
                    } while (i != -1 && j != -1);
                    if (i != j) {
                        if (cb.isSelected())
                            lb.setText("Files differ at location " + count);
                        else
                            lb.setText("Files are not the same.");
                    } else
                        lb.setText("Files compare equal.");
                } catch (IOException exc) {
                    lb.setText("File Error");
                }
            }
        });

        Separator s = new Separator();
        s.setPrefWidth(180);
        rootNode.getChildren().addAll(tf1, tf2, cb, btComp, s, lb);
        stage.show();
    }
}
