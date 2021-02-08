package com.company.glava17;
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.effect.*;
import javafx.scene.paint.*;
import javafx.scene.transform.*;

public class EffectsAndTDemo extends Application {
    double angle = 0.0, scale = 0.4, blur = 1.0;

    //Создать начальные объекты преобразований и эффектов
    Reflection reflection = new Reflection();
    BoxBlur boxBlur = new BoxBlur(1.0, 1.0, 1);
    Rotate rotate = new Rotate();
    Scale sca = new Scale(scale, scale);

    //Создать кнопки
    Button btRot = new Button("Rotate");
    Button btBlur = new Button("Blur off");
    Button btScale = new Button("Scale");
    Label reflect = new Label("Reflection Adds Visual Sparkle");

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) {
        stage.setTitle("Effects and Transforms Demo");
        FlowPane rootNode = new FlowPane(20, 20);
        rootNode.setAlignment(Pos.CENTER);
        Scene scene = new Scene(rootNode, 300, 120);
        stage.setScene(scene);
        //Добавить поворот в список преобразований для кнопки Rotate
        btRot.getTransforms().add(rotate);
        //Добавить масштабирование
        btScale.getTransforms().add(sca);
        //Задать эффект отражения для метки Reflection
        reflection.setTopOpacity(0.7);
        reflection.setBottomOpacity(0.3);
        reflect.setEffect(reflection);

        //Обработать события действий для кнопки Rotate
        btRot.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                //При каждом нажатии кнопки она поворачивается на 30 градусов ыокруг центра
                angle += 15.0;

                rotate.setAngle(angle);
                rotate.setPivotX(btRot.getWidth()/2);
                rotate.setPivotY(btRot.getHeight()/2);
            }
        });

        btScale.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                scale += 0.1;
                if(scale > 2.0)
                    scale = 0.4;
                sca.setX(scale);
                sca.setY(scale);
            }
        });

        btBlur.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(blur == 10.0) {
                    blur = 1.0;
                    btBlur.setEffect(null);
                    btBlur.setText("Blur off");
                } else {
                    blur++;
                    btBlur.setEffect(boxBlur);
                    btBlur.setText("Blur on");
                }
                boxBlur.setWidth(blur);
                boxBlur.setHeight(blur);
            }
        });

        rootNode.getChildren().addAll(btRot, btScale, btBlur, reflect);
        stage.show();
    }
}
