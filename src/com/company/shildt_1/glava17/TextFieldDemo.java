package com.company.glava17;
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.event.*;

public class TextFieldDemo extends Application {
    TextField tf;
    Label response;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) {
        stage.setTitle("TestFiled Demo");
        FlowPane rootNode = new FlowPane(10, 10);
        rootNode.setAlignment(Pos.CENTER);
        Scene scene = new Scene(rootNode, 230, 140);
        stage.setScene(scene);
        response = new Label("Enter Name: ");
        Button btGet = new Button("Get Name");
        tf = new TextField();
        //Задать подсказку
        tf.setPromptText("Enter a name.");
        //Задать предпочтительное количество столбцов
        tf.setPrefColumnCount(15);
        //Использовать лямбда-выражение, обраб. события действий
        //для текстового поля. События действий генерируются при нажатии
        //клавиши ENTER
        tf.setOnAction((ae) -> response.setText("Enter pressed. Name is: " + tf.getText()));
        //Использовать Л-В для получения текста из текстового поля при нажатии кнопки
        btGet.setOnAction((ae) -> response.setText("Button pressed. Name is: " + tf.getText()));
        //Использовать разделитель для лучшей организации вывода
        Separator s = new Separator();
        s.setPrefWidth(180);
        rootNode.getChildren().addAll(tf, btGet, s, response);
        stage.show();
    }
}
