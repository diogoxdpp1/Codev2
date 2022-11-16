module com.example.codev2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires jfxrt;
    requires rt;


    opens com.example.codev2 to javafx.fxml;
    exports com.example.codev2;
}