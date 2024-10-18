module com.example.lab2n {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.lab2n to javafx.fxml;
    exports com.example.lab2n;
}