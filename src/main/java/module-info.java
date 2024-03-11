module com.example.dipractica6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dipractica6 to javafx.fxml;
    exports com.example.dipractica6;
}