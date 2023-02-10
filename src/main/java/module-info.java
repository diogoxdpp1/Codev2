module com.example.codev2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.codev2 to javafx.fxml;
    exports com.example.codev2;
}