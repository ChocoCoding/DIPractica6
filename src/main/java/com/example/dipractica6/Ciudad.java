package com.example.dipractica6;

import javafx.scene.image.Image;

public class Ciudad {
    String nombre;
    Image image;

    public Ciudad(String nombre, Image image) {
        this.nombre = nombre;
        this.image = image;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        return this.nombre;
    }
}
