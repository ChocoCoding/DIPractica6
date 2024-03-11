package com.example.dipractica6;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class VistaEjercicio1 extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(VistaEjercicio1.class.getResource("vistaEj2.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Elige tu ciudad");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}