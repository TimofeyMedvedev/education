package com.company.glava17;
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.beans.value.*;
import javafx.collections.*;

public class ListViewDemo extends Application {
    Label response;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) {
        stage.setTitle("ListView Demo");
        FlowPane rootNode = new FlowPane(10, 10);
        rootNode.setAlignment(Pos.CENTER);
        Scene scene = new Scene(rootNode, 200, 120);
        stage.setScene(scene);
        response = new Label("Select Computer Type");

        //Создать объект типа ObservableList для списка
        ObservableList<String> computers = FXCollections.observableArrayList("Smartphone",
                "Tablet", "Notebook", "Desktop");
        //Создать список
        ListView<String> lvcomp = new ListView<>(computers);
        //Задать значения высоты и ширины
        lvcomp.setPrefSize(100, 70);
        //Получить модель выбора для списка
        MultipleSelectionModel<String> lvMSM = lvcomp.getSelectionModel();
        //Использовать слушатель для реагирования на изменения выделения внутри списка
        lvMSM.selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                //Отобразить выбор
                response.setText("Computer selected is " + t1);
            }
        });

        rootNode.getChildren().addAll(lvcomp, response);
        stage.show();
    }
}
