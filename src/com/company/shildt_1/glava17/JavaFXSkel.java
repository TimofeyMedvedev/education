package com.company.glava17;
        import javafx.application.*;
        import javafx.scene.*;
        import javafx.stage.*;
        import javafx.scene.layout.*;

public class JavaFXSkel extends Application {
    public static void main(String[] args) {
        System.out.println("Запуск приложения JavaFX");
        launch(args);
    }

    //Переопределить метод init()
    public void init() {
        System.out.println("В теле метода init()");
    }

    //Переопределить метод start()
    public void start(Stage myStage) {
        System.out.println("В теле метода start()");

        //Установить заголовок окна приложения
        myStage.setTitle("Каркас приложения JavaFX");

        //Создать корневой узел. В данном случае используется плавающая
        //компоновка, но возможны и другие варианты
        FlowPane rootNode = new FlowPane();

        //Создать сцену
        Scene myScene = new Scene(rootNode, 300, 200);

        //Установить сцену на платформе
        myStage.setScene(myScene);

        //Отобразить платформу вместе с её сценой
        myStage.show();
    }

    //Переопределить метод stop()
    public void stop() {
        System.out.println("В теле метода stop()");
    }
}
