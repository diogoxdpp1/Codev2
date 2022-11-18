module com.example.codev2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.codev2 to javafx.fxml;
    exports com.example.codev2;
}