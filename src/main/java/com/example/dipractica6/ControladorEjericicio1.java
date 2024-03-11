package com.example.dipractica6;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class ControladorEjericicio1 implements Initializable {

    @FXML
    private AnchorPane panelPrincipal;

    @FXML
    private ListView<Ciudad> listaCiudades;

    @FXML
    private ImageView imagenCiudad;

    @FXML
    private Button btnAsignarEstilo;

    @FXML
    private Button btnLimpiarEstilo;

    @FXML
    public void onAsignarEstilo(ActionEvent e){
        Scene scene = this.panelPrincipal.getScene();

        scene.getStylesheets().add("estilo.css");
    }

    @FXML
    public void onLimpiarEstilo(ActionEvent e){

    }

    private ObservableList<Ciudad> listaCiudadesObservable = FXCollections.observableArrayList();;

    String absolutePath = new File("src/main/resources/images").getAbsolutePath();


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        listaCiudadesObservable.add(new Ciudad("Madrid", new Image("file:///" + absolutePath + "\\img1.jpg")));
        listaCiudadesObservable.add(new Ciudad("Barcelona", new Image("file:///" + absolutePath + "\\img2.jpg")));
        listaCiudadesObservable.add(new Ciudad("Sevilla", new Image("file:///" + absolutePath + "\\img3.jpg")));
        listaCiudadesObservable.add(new Ciudad("Málaga", new Image("file:///" + absolutePath + "\\img4.jpg")));
        listaCiudadesObservable.add(new Ciudad("Valencia", new Image("file:///" + absolutePath + "\\img5.jpg")));
        listaCiudadesObservable.add(new Ciudad("Oporto", new Image("file:///" + absolutePath + "\\img6.jpg")));


        listaCiudades.setItems(listaCiudadesObservable);

        listaCiudades.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Ciudad>() {
            @Override
            public void changed(ObservableValue<? extends Ciudad> observableValue, Ciudad viejaCiudad, Ciudad nuevaCiudad) {
                Image image = nuevaCiudad.getImage();
                imagenCiudad.setImage(image);
                Stage stage = new Stage();
                stage.setUserData(nuevaCiudad);
            }
        });
    }
}